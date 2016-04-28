package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


@XmlAccessorType(XmlAccessType.FIELD)
public class Poll implements Serializable {

	private String title;
	private String creatorUsername;
	private String creationDate;
	private boolean open;
	
	@XmlElementWrapper
	@XmlElement(name = "time")
	private ArrayList<String> times;

	public Poll() {
		// TODO Auto-generated constructor stub
	}

	public Poll(String title, String creatorUsername, String creationDate, boolean open, ArrayList<String> times) {
		super();
		this.title = title;
		this.creatorUsername = creatorUsername;
		this.creationDate = creationDate;
		this.open = open;
		this.times = times;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatorUsername() {
		return creatorUsername;
	}

	public void setCreatorUsername(String creatorUsername) {
		this.creatorUsername = creatorUsername;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public ArrayList<String> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<String> times) {
		this.times = times;
	}
}
