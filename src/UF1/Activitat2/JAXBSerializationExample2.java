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
		
		JAXBContext context = JAXBContext.newInstance(Rows.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Rows rows = ompleRows();
		
		//Mostrem el document XML generat por la sortida estandard
		marshaller.marshal(rows, System.out);
		
		FileOutputStream fos = new FileOutputStream(ROWS_XML_FILE);
		//guardem l'objecte serializat en un document XML
		marshaller.marshal(rows, fos);
		fos.close();
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//Deserialitzem a partir de un document XML
		Rows alumnesAux = (Rows) unmarshaller.unmarshal(new File(ROWS_XML_FILE));
		System.out.println("********* Rows carregats desde fitxer XML***************");
		//Mostrem l'objeto Java obtingut
		marshaller.marshal(alumnesAux, System.out);
		
	}
	
	private static Rows ompleRows(){
		
		
		String[] nomDelFestiu = {"Fiesta1", "Fiesta2", "Fiesta3", "Fiesta4"};
        String[] data = {"2018-01-06T00:04:00", "2018-01-06T00:10:00", "2018-01-06T00:20:00", "2018-01-06T00:03:00"};
        String[] localitzacio = {"Salou", "Tarragona", "Reus", "Valls"};
		int[] any_calendari = {2016, 1820, 1999, 2020};
		String[] _adress = {"https://analisfi.transparenciacatalunya.cat/resource/yf2b-mjr6/row-efjc~t6wi.7y5k",
				"https://analisi.transparencgiacatalunya.cat/resource/yf2b-mjr6/row-efjc~t6wi.7y5k",
				"https://analisi.transdparenciacatalunya.cat/resource/yf2b-mjr6/row-efjc~t6wi.7y5k",
				"https://analisi.transparencigacatalunya.cat/resource/yf2b-mjr6/row-efjc~t6wi.7y5k"};
		String[] _id = {"row-efjc~t6wi.7y5k","row-efjc~t6wi.7y5k",
				"row-efjc~t6wi.7y5k","row-efjc~t6wi.7y5k"};
		int[] positions = {1,4,8,3};
		String[] _uuid = {"00000000-0000-0000-27CA-66ABEA857B6F","00000000-0000-0000-27CA-66ABEA857B6F",
				"00000000-0000-0000-27CA-66ABEA857B6F","00000000-0000-0000-27CA-66ABEA857B6F"};
		Alumne[] ArrayAlumnes = new Alumne[4];
		
		for(int i=0; i<4; i++){
			ArrayAlumnes[i] = new Alumne();
                        ArrayAlumnes[i].setNomDelFestiu(nomDelFestiu[i]);
                        ArrayAlumnes[i].setData(data[i]);
                        ArrayAlumnes[i].setLocalitzacio(localitzacio[i]);
                        ArrayAlumnes[i].setAnyCalendari(any_calendari[i]);
			ArrayAlumnes[i].setId(i);	
			ArrayAlumnes[i].setAdress(_adress[i]);
			ArrayAlumnes[i].setPosition(positions[i]);
			ArrayAlumnes[i].setUuid(_uuid[i]);
		}
		
		Rows rows = new Rows();
		rows.setAlumnes(ArrayAlumnes);
		
		return rows;
	}
 
}