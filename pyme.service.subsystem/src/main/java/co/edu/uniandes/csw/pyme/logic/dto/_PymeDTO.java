
package co.edu.uniandes.csw.pyme.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _PymeDTO {

	private String name;
	private Long id;
	private String description;
        private String direccion;
        private Integer telefono;

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
        
        public String getDireccion() {
		return description;
	}
 
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
        
        public Integer getTelefono() {
		return telefono;
	}
 
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
}