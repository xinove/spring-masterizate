package com.creativate.masterizate.model.objects;
 
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;

//import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "curriculums", catalog = "masterizate"
		//, uniqueConstraints = {
		//@UniqueConstraint(columnNames = "id_cliente"),
		//@UniqueConstraint(columnNames = "id_usuario_fk") }
		)
public class Curriculum {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cv",unique=true, nullable = false)
	private String id;
	
	@Column(name = "id_cliente_fk")
	private String idCliente;
	String name;
	private int enabled;

	public Curriculum(){}
    public Curriculum( String idCV, String name, String idCliente, int enabled){
        this.id=idCV;
        this.name=name;
        this.idCliente=idCliente;
        this.enabled=enabled;      
    }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	@Override
    public String toString() {
        return String.format(
                "Client[id=%s, Nombre='%s', idClienteFk='%s', enabled='%s']",
                id, name, idCliente, enabled);
    }
}