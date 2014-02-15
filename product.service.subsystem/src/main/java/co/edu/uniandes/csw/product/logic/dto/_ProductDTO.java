
package co.edu.uniandes.csw.product.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ProductDTO {

	private Long id;
	private String name;
	private Long value;
        private String marca;
        private Date fechaExpedicion;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
        
        public Long getValue() {
		return value;
	}
 
	public void setValue(Long value) {
		this.value = value;
	}
	
        public String getMarca() {
		return name;
	}
 
	public void setMarca(String marca) {
		this.marca = marca;
	}
        
        public Date getFechaExpedicion() {
		return fechaExpedicion;
	}
 
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	
}