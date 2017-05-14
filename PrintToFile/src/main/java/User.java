import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private int id;
	private String nome;
	private String cognome;
	private String dataNascita;
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	@XmlElement
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	@XmlElement
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getDataNascita() {
		return dataNascita;
	}
	@XmlElement
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	
	 
}
