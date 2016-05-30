package uts.wsd.soap.client;

public class CreatorSoapProxy implements uts.wsd.soap.client.CreatorSoap {
  private String _endpoint = null;
  private uts.wsd.soap.client.CreatorSoap creatorSoap = null;
  
  public CreatorSoapProxy() {
    _initCreatorSoapProxy();
  }
  
  public CreatorSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreatorSoapProxy();
  }
  
  private void _initCreatorSoapProxy() {
    try {
      creatorSoap = (new uts.wsd.soap.client.CreatorSoapServiceLocator()).getCreatorSoapPort();
      if (creatorSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creatorSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creatorSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creatorSoap != null)
      ((javax.xml.rpc.Stub)creatorSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public uts.wsd.soap.client.CreatorSoap getCreatorSoap() {
    if (creatorSoap == null)
      _initCreatorSoapProxy();
    return creatorSoap;
  }
  
  public uts.wsd.soap.client.Creator login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException{
    if (creatorSoap == null)
      _initCreatorSoapProxy();
    return creatorSoap.login(arg0, arg1);
  }
  
  public uts.wsd.soap.client.Poll[] getOpenPolls() throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException{
    if (creatorSoap == null)
      _initCreatorSoapProxy();
    return creatorSoap.getOpenPolls();
  }
  
  public uts.wsd.soap.client.Poll[] getPollsByCreator(java.lang.String arg0) throws java.rmi.RemoteException, uts.wsd.soap.client.JAXBException, uts.wsd.soap.client.IOException{
    if (creatorSoap == null)
      _initCreatorSoapProxy();
    return creatorSoap.getPollsByCreator(arg0);
  }
  
  
}