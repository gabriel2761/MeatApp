package uts.wsd.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;

import uts.wsd.Poll;
import uts.wsd.PollBean;
import uts.wsd.Polls;

import java.io.*;

@Path("/meetApp")
public class MeetAppService {

	@Context
	private ServletContext application;

	private PollBean getMeetApp() throws JAXBException, IOException {
		synchronized (application) {
			PollBean meetApp = (PollBean) application.getAttribute("MeetApp");
			if (meetApp == null) {
				meetApp = new PollBean();
				meetApp.setPollFilePath(application.getRealPath("WEB-INF/polls.xml"));
				application.setAttribute("meetApp", meetApp);
			}
			return meetApp;
		}
	}

	@Path("polls")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Polls getPolls() throws JAXBException, IOException {
		return getMeetApp().getPolls();
	}

	@Path("/polls/{title}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Poll findPoll(@PathParam("title") String title) throws JAXBException, IOException {
		return getMeetApp().getPolls().findPoll(title);

	}

}
