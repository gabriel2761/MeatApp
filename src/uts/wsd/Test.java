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

        ArrayList<String> times = new ArrayList<>();
        times.add("12:45");
        times.add("11:50");
        times.add("8:49");

        Polls polls = new Polls();
        polls.addPoll(new Poll("picnic", "bobby", "22/6/16", true, times));
        polls.addPoll(new Poll("dinner", "kaitlyn", "19/4/29", true, times));

        JAXBContext jc = JAXBContext.newInstance(Polls.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(polls, System.out);
	}

}
