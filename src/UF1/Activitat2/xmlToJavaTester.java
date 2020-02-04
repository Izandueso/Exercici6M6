package UF1.Activitat2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class xmlToJavaTester {
	
	File xmlFile = new File("rows.xml");
	 
	JAXBContext jaxbContext;
	try
	{
	    jaxbContext = JAXBContext.newInstance(xmlToJava.class);              
	 
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 
	    xmlToJava xmlToJava = (xmlToJava) jaxbUnmarshaller.unmarshal(xmlFile);
	     
	    System.out.println(xmlToJava);
	}
	catch (JAXBException e) 
	{
	    e.printStackTrace();
	}
	 
	}
}
