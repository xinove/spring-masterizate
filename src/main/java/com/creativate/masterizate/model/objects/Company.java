package com.creativate.masterizate.model.objects;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "companies", catalog = "masterizate", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id_cliente"),
		@UniqueConstraint(columnNames = "id_usuario_fk") })
public class Company {
 
	@Id
	private String id;
	
	private String idUser;
	String name;
	String surName;
	String email;
	String address;

	public Company(){}
    public Company( String idUser, String name, String surName, String email, 
    			   String address){
        this.idUser=idUser;
        this.name=name;
        this.surName=surName;
        this.email=email;
        this.address=address;        
    }
	
    @GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
    public String toString() {
        return String.format(
                "Client[id=%s, Nombre='%s', Apellido='%s', Email='%s', Direcci�n='%s']",
                id, name, email, address);
    }
 
 
}