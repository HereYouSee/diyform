package com.soap;

import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zmm on 17-5-2.
 */
public class Receiver {

    public void init() throws IOException, SOAPException {


        String ns = "http://axisversion.sample";
        String wsdlUrl = "http://127.0.0.1:8080/axis2/services/Version?wsdl";
        URL url = new URL(wsdlUrl);
        QName sname = new QName(ns, "Version");
        Service service = this.buildService(url,sname);

        // create dispath
        Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "VersionHttpSoap11Endpoint"), SOAPMessage.class, Service.Mode.MESSAGE);


        // crate soapMessage
        SOAPMessage msg = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage();

        SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();
        SOAPBody body = envelope.getBody();

        // create QName to assign message to pass data
        QName ename = new QName(ns, "getVersion", "axis");
        SOAPBodyElement ele = body.addBodyElement(ename);

        msg.writeTo(System.out);

        System.out.println("invoking...........");

        // by dispath to pass message and callback response mesg
        SOAPMessage response = dispatch.invoke(msg);
        response.writeTo(System.out);
        System.out.println();

        // deal the response and convert the msg to dom object
        Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();

        String retStr = doc.getElementsByTagName("ns:return").item(0).getTextContent();

        System.out.println(retStr);
        
    }


    private Service buildService(URL url,QName sname) {
        Service service;
        service = Service.create(url, sname);
        return service;
    }
}
