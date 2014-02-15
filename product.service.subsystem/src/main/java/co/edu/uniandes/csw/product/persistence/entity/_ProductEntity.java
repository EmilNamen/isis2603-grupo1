
package co.edu.uniandes.csw.product.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _ProductEntity {

	@Id
	@GeneratedValue(generator = "Product")
	private Long id;
	private String name;
	private Long value;
        private String marca;
        private String fechaExpedicion;

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
	public Long getValue(){
		return value;
	}
	
	public void setValue(Long value){
		this.value = value;
	}
        
         public String getMarca() {
		return name;
	}
 
	public void setMarca(String marca) {
		this.marca = marca;
	}
        
        public String getFechaExpedicion() {
		return fechaExpedicion;
	}
 
	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
}