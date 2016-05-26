package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.sun.prism.shader.Texture_Color_AlphaTest_Loader;

@XmlAccessorType(XmlAccessType.FIELD)
public class Poll implements Serializable {

	private int id;
	private String title;
	private String creatorUsername;
	private String creationDate;
	private String location;
	private String description;
	private boolean open;
	
	@XmlElement(name = "times")
	private Times times;

	@XmlElementWrapper
	@XmlElement(name = "vote")
	private ArrayList<Vote> votes = new ArrayList<>();

	public Poll() {
		// TODO Auto-generated constructor stub
	}

	public Poll(String title, String creatorUsername, String creationDate, String location, String description,
			boolean open, Times times) {
		super();
		this.title = title;
		this.creatorUsername = creatorUsername;
		this.creationDate = creationDate;
		this.location = location;
		this.description = description;
		this.open = open;
		this.times = times;
	}

	public void addVote(Vote vote) {
		votes.add(vote);
	}

	public ArrayList<Vote> getVotes() {
		return votes;
	}

	public void setVotes(ArrayList<Vote> votes) {
		this.votes = votes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Times getTimes() {
		return times;
	}

	public void setTimes(Times times) {
		this.times = times;
	}

}
