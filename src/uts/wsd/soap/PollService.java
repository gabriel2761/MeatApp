package uts.wsd.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PollService {

	
	public PollService() {
	}
	
	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}
	

}
