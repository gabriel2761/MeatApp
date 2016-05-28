package uts.wsd.soap;

import java.io.IOException;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import uts.wsd.Creator;
import uts.wsd.CreatorBean;
import uts.wsd.PollBean;
import uts.wsd.Polls;

@WebService
public class CreatorSoap {

	public CreatorSoap() {
	}

	@Resource
	private WebServiceContext context;
	
	private PollBean getPollBean() throws JAXBException, IOException {
		ServletContext application = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
		synchronized (application) {
			PollBean pollBean = (PollBean) application.getAttribute("pollbean");
			if (pollBean == null) {
				pollBean = new PollBean();
				pollBean.setPollFilePath(application.getRealPath("WEB-INF/polls.xml"));
				application.setAttribute("pollBean", pollBean);
			}
			return pollBean;
		}
	}
	
	private CreatorBean getCreatorBean() throws JAXBException, IOException {
		ServletContext application = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
		synchronized (application) {
			CreatorBean creatorBean = (CreatorBean) application.getAttribute("pollbean");
			if (creatorBean == null) {
				creatorBean = new CreatorBean();
				creatorBean.setCreatorFilePath(application.getRealPath("WEB-INF/creators.xml"));
				application.setAttribute("creatorBean", creatorBean);
			}
			return creatorBean;
		}
	}

	@WebMethod
	public Creator login(String username, String password) throws JAXBException, IOException {
		return getCreatorBean().getCreators().login(username, password);
	}
	
	@WebMethod
	public Polls getPolls() throws JAXBException, IOException {
		return getPollBean().getPolls();
	}

}
