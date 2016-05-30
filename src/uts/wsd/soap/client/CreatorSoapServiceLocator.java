/**
 * CreatorSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uts.wsd.soap.client;

public class CreatorSoapServiceLocator extends org.apache.axis.client.Service implements uts.wsd.soap.client.CreatorSoapService {

    public CreatorSoapServiceLocator() {
    }


    public CreatorSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreatorSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreatorSoapPort
    private java.lang.String CreatorSoapPort_address = "http://localhost:8080/MeetApp/soap/creatorsoap";

    public java.lang.String getCreatorSoapPortAddress() {
        return CreatorSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreatorSoapPortWSDDServiceName = "CreatorSoapPort";

    public java.lang.String getCreatorSoapPortWSDDServiceName() {
        return CreatorSoapPortWSDDServiceName;
    }

    public void setCreatorSoapPortWSDDServiceName(java.lang.String name) {
        CreatorSoapPortWSDDServiceName = name;
    }

    public uts.wsd.soap.client.CreatorSoap getCreatorSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreatorSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreatorSoapPort(endpoint);
    }

    public uts.wsd.soap.client.CreatorSoap getCreatorSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uts.wsd.soap.client.CreatorSoapPortBindingStub _stub = new uts.wsd.soap.client.CreatorSoapPortBindingStub(portAddress, this);
            _stub.setPortName(getCreatorSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreatorSoapPortEndpointAddress(java.lang.String address) {
        CreatorSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uts.wsd.soap.client.CreatorSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                uts.wsd.soap.client.CreatorSoapPortBindingStub _stub = new uts.wsd.soap.client.CreatorSoapPortBindingStub(new java.net.URL(CreatorSoapPort_address), this);
                _stub.setPortName(getCreatorSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CreatorSoapPort".equals(inputPortName)) {
            return getCreatorSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.wsd.uts/", "CreatorSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.wsd.uts/", "CreatorSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreatorSoapPort".equals(portName)) {
            setCreatorSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
