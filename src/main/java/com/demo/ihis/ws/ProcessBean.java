package com.demo.ihis.ws;

import java.beans.Expression;
import java.beans.Statement;
import java.util.StringTokenizer;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.camel.Exchange;

import com.demo.ihis.entity.MedObjectImpl;

public class ProcessBean {

	public MedObjectImpl convertToPOJO(Exchange exchange) {
		//String s=((String[])exchange.getIn().getBody())[0];
		String s=exchange.getIn().getBody(String.class);
		System.out.println("*****"+s);
/*		StringTokenizer st=new StringTokenizer(s,"|");
		int count=0;
		while (st.hasMoreElements()) {
			System.out.println(++count+":"+st.nextElement());
		}		
*/	
		s = s.replaceAll("\\n", "");
		s = s.replaceAll("\\r", "");
		 String[] tokens=s.split("\\|",-1);
		 System.out.println(tokens.length);
			int count=0;
			Object o=new MedObjectImpl();
			Statement stmt=null;
			Expression expr=null;
		for (String token : tokens) {
			System.out.println(++count+":"+token);	
			stmt=new Statement(o,"setField"+count, new Object[]{token});
			try {
				stmt.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		MedObjectImpl med=(MedObjectImpl)o;
		//clean up some date info
		med.setField82(med.getField82().replaceAll("T", " "));
		med.setField83(med.getField83().replaceAll("T", " "));
		med.setField84(med.getField84().replaceAll("T", " "));

/*		System.out.println("*******************"+med.getField82());
		System.out.println("*******************"+med.getField83());
		System.out.println("*******************"+med.getField84());
*/
		System.out.println("Converted @"+med.getNow());
		return med;
	}

	
	public String[] convert(Exchange exchange) {
		String s=exchange.getIn().getBody(String.class);
		String[] ss={s};
		//s+="------------------------";

		return ss;
	}
	public SOAPMessage process(Exchange exchange) {
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
