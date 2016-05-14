package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Polls implements Serializable {

	@XmlElement(name = "poll")
	private ArrayList<Poll> list = new ArrayList<>();

	public Polls() {
		// TODO Auto-generated constructor stub
	}

	public void addPoll(Poll poll) {
		list.add(poll);
	}

	public ArrayList<Poll> getList() {
		return list;
	}

	public Poll findPoll(String title) {
		for (Poll poll : list) {
			if (poll.getTitle().equals(title)) return poll;
		}
		return null;
	}
}
