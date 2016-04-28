package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MeetApp implements Serializable {

	private String creatorFilePath;
	private Creators creators;

	private String pollFilePath;
	private Polls polls;

	public MeetApp() {
		// TODO Auto-generated constructor stub
	}

	public String getPollFilePath() {
		return pollFilePath;
	}

	public void setPollFilePath(String pollFilePath) throws JAXBException, IOException {
		this.pollFilePath = pollFilePath;

		JAXBContext jc = JAXBContext.newInstance(Polls.class);
		Unmarshaller u = jc.createUnmarshaller();

		FileInputStream fin = new FileInputStream(pollFilePath);
		polls = (Polls) u.unmarshal(fin);
		fin.close();
	}

	public Polls getPolls() {
		return polls;
	}

	public void setPolls(Polls polls) {
		this.polls = polls;

	}

	public String getCreatorFilePath() {
		return creatorFilePath;
	}

	public void setCreatorFilePath(String creatorFilePath) throws JAXBException, IOException {
		this.creatorFilePath = creatorFilePath;

		JAXBContext jc = JAXBContext.newInstance(Creators.class);
		Unmarshaller u = jc.createUnmarshaller();

		FileInputStream fin = new FileInputStream(creatorFilePath);
		creators = (Creators) u.unmarshal(fin);
		fin.close();
	}

	public Creators getCreators() {
		return creators;
	}

	public void setCreators(Creators creators) {
		this.creators = creators;
	}
}
