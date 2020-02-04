/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Activitat2;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@XmlRootElement(name = "row")

//@XmlAccessorType(XmlAccessType.FIELD) 
class Alumne {
        
        private int id;
        private int anyCalendari;	
        private String nomDelFestiu;
        private String data;
        private String localitzacio;
 
        @XmlAttribute(name="id")        
        public int getId() {
		return this.id;
	}        
            
	public void setId(int id) {
		this.id = id;
	}
        
        @XmlAttribute(name="nom_del_festiu")    
	public String getNomDelFestiu() {
		return nomDelFestiu;
	}        
           
	public void setNomDelFestiu(String nomDelFestiu) {
		this.nomDelFestiu = nomDelFestiu;
	}

        @XmlAttribute(name="data")    
	public String getData() {
		return data;
	}
	public void setData(String anyDelFestiu) {
		this.data = anyDelFestiu;
	}        
        
        @XmlAttribute(name="localitzacio")    
	public String getLocalitzacio() {
		return localitzacio;
	}
	public void setLocalitzacio(String localitzacio) {
		this.localitzacio = localitzacio;
	}        
        
        @XmlAttribute(name="any_calendari")    
        public int getAnyCalendari() {
		return this.anyCalendari;
	}
	public void setAnyCalendari(int anyCalendari) {
		this.anyCalendari = anyCalendari;
	}
        
}
