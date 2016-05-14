package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class Test implements Serializable {

	public static void main(String args[]) throws JAXBException {
//		Creators creators = new Creators();
//		creators.addCreator(new Creator("bobby", "brown"));
//		creators.addCreator(new Creator("fish", "face"));
//
//		JAXBContext jc = JAXBContext.newInstance(Creators.class);
//		Marshaller m = jc.createMarshaller();
//		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		m.marshal(creators, System.out);

        Times times = new Times();
        times.addTime("12:45");
        times.addTime("11:50");
        times.addTime("8:49");
		
		String desc1 = "This is a for a birthday party";
        String desc2 = "Graduation dinner for the new graduates";

        ArrayList<Vote> votes = new ArrayList<>();
        votes.add(new Vote("Hello", "3243"));
        votes.add(new Vote("qrwe", "4983"));
        
        Polls polls = new Polls();
        polls.addPoll(new Poll("picnic", "bobby", "22/6/16", "bondi", desc1, true, times));
        polls.addPoll(new Poll("dinner", "kaitlyn", "19/4/29", "Opera house", desc2, true, times));

        JAXBContext jc = JAXBContext.newInstance(Polls.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(polls, System.out);
		
	}

}
