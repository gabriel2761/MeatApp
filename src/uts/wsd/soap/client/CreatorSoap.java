/**
 * CreatorSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uts.wsd.soap.client;

public interface CreatorSoap extends java.rmi.Remote {
    public uts.wsd.soap.client.Creator login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException;
    public uts.wsd.soap.client.Poll[] getOpenPolls() throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException;
    public uts.wsd.soap.client.Poll[] getPollsByCreator(java.lang.String arg0) throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException;
}
