package uts.wsd.soap.client;

import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

import uts.wsd.Polls;

public class CreatorClient {

	public static void main(String[] args) throws JAXBException, IOException, RemoteException, ServiceException {
		new CreatorClient();
	}

	public CreatorClient() throws JAXBException, IOException, RemoteException, ServiceException {
		String choice;
		String instructions = "1: Login\n2: View Polls\n3: Exit\nYour choice: ";
		while ((choice = readline(instructions)) != "x") {
			switch (choice) {
			case "1":
				account();
				break;
			case "2":
				viewPolls();
				break;
			case "3":
				System.out.println("Exiting program");
				return;
			default:
				System.err.println("Invalid command");
				break;
			}
		}
	}

	private void account() throws JAXBException, IOException, RemoteException, ServiceException {
		Creator creator = null;
		if ((creator = login()) == null)
			return;

		System.out.println("Login Successful, Welcome " + creator.getUsername());
	}

	private Creator login() throws JAXBException, IOException, RemoteException, ServiceException {
		String choice = "";
		Creator creator = null;
		int tries = 0;
		boolean loggedin = false;
		while (tries++ < 3) {
			String username = readline("Username: ");
			String password = readline("Password: ");

			CreatorSoapServiceLocator locator = new CreatorSoapServiceLocator();
			creator = locator.getCreatorSoapPort().login(username, password);

			if (creator != null) {
				return creator;
			} else {
				System.err.println("Username or password is incorrect");
			}
		}

		System.err.println("Number of tries exceeded");
		return null;
	}

	private void viewPolls() throws JAXBException, IOException, RemoteException, ServiceException {
		CreatorSoapServiceLocator locator = new CreatorSoapServiceLocator();
		CreatorSoap creatorsoap = locator.getCreatorSoapPort();
		for (Poll poll : creatorsoap.getOpenPolls()) {
			System.out.println(
					"----------------\n" +
					"Poll title: " + poll.getTitle() + "\n" +
					"Creator: " + poll.getCreatorUsername() + "\n" +
					"Creation Date: " + poll.getCreationDate() + "\n" +
					"Location: " + poll.getLocation() + "\n" +
					"Description: " + poll.getDescription() + "\n");
		}
	}

	private String readline(String message) {
		System.out.print(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}

