/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Activitat2;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
public class JAXBSerializationExample2 {
	
	private static final String ROWS_XML_FILE = "rows.xml";
 
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Alumnes.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Alumnes rows = ompleRows();
		
		//Mostrem el document XML generat por la sortida estandard
		marshaller.marshal(rows, System.out);
		
		FileOutputStream fos = new FileOutputStream(ROWS_XML_FILE);
		//guardem l'objecte serializat en un document XML
		marshaller.marshal(rows, fos);
		fos.close();
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//Deserialitzem a partir de un document XML
		Alumnes alumnesAux = (Alumnes) unmarshaller.unmarshal(new File(ROWS_XML_FILE));
		System.out.println("********* Alumnes carregat desde fitxer XML***************");
		//Mostrem l'objeto Java obtingut
		marshaller.marshal(alumnesAux, System.out);
		
	}
	
	private static Alumnes ompleRows(){
		
		
		String[] nomDelFestiu = {"Fiesta1", "Fiesta2", "Fiesta3", "Fiesta4"};
        String[] data = {"2018-01-06T00:00:00", "2018-01-06T00:00:00", "2018-01-06T00:00:00", "2018-01-06T00:00:00"};
        String[] localitzacio = {"Salou", "Tarragona", "Reus", "Valls"};
		int[] any_calendari = {2016, 1820, 1999, 2020};
		Alumne[] ArrayAlumnes = new Alumne[4];
		
		for(int i=0; i<4; i++){
			ArrayAlumnes[i] = new Alumne();
                        ArrayAlumnes[i].setNomDelFestiu(nomDelFestiu[i]);
                        ArrayAlumnes[i].setData(data[i]);
                        ArrayAlumnes[i].setLocalitzacio(localitzacio[i]);
                        ArrayAlumnes[i].setAnyCalendari(any_calendari[i]);
			ArrayAlumnes[i].setId(i);			
		}
		
		Alumnes alumnes = new Alumnes();
		alumnes.setAlumnes(ArrayAlumnes);
		
		return alumnes;
	}
 
}