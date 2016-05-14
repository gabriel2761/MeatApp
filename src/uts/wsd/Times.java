package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Times implements Serializable {

	@XmlElement(name = "time")
	private ArrayList<String> list = new ArrayList<>();

	public Times() {
		// TODO Auto-generated constructor stub
	}
	
	public void addTime(String time) {
		list.add(time);
	}

	public ArrayList<String> getList() {
		return list;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
