package com.demo.ihis.ws;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.camel.Exchange;

public class ProcessBean {

	public String convert(Exchange exchange) {
		System.out.println("*****"+exchange.getIn().getBody());
		String s=exchange.getIn().getBody(String.class);
		return s;
	}
	public SOAPMessage enrich(Exchange exchange) {
		SOAPMessage soapMessage=null;
		try {
			soapMessage = MessageFactory.newInstance().createMessage();
			SOAPBody body=soapMessage.getSOAPPart().getEnvelope().getBody();
			body.setValue("testing 123");
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return soapMessage;
	}
}
