
package co.edu.uniandes.csw.client.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _ClientEntity {

	@Id
	@GeneratedValue(generator = "Client")
	private Long id;
	private String name;
        private String lastName;
	private String cc;
        private String birthDate;
        

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
        public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastname){
		this.lastName = lastname;
	}
	public String getCc(){
		return cc;
	}
	
	public void setCc(String cc){
		this.cc = cc;
	}
        public String getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(String birthdate){
		this.birthDate = birthdate;
	}
}