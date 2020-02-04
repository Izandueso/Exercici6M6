package UF1.Activitat2;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class xmlToJava implements Serializable {
 
    private static final long serialVersionUID = 1L;
     
    private int id;
    private String anyCalendari;	
    private String nomDelFestiu;
    private String data;
    private String localitzacio;
     
    public xmlToJava() {
        super();
    }
 
    public xmlToJava(int id, String anyCalendari, String nomDelFestiu, String data, String localitzacio) {
        super();
        this.id = id;
        this.anyCalendari = anyCalendari;
        this.nomDelFestiu = nomDelFestiu;
        this.data = data;
        this.localitzacio = localitzacio;
    }
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "Rows [id=" + id + ", any=" + anyCalendari + ", Nom Del Festiu=" + nomDelFestiu + ", Data="+ data + "Localitzacio= " + localitzacio  + "]";
    }
}
 
