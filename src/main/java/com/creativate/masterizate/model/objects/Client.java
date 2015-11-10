package com.creativate.masterizate.model.objects;
 

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
// javax.validation.constraints.NotNull;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

//import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "clients", catalog = "masterizate"
		//, uniqueConstraints = {
		//@UniqueConstraint(columnNames = "id_cliente"),
		//@UniqueConstraint(columnNames = "id_usuario_fk") }
		)
public class Client {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_client",unique=true, nullable = false)
	private String id;
	
	@Column(name = "id_user_fk")
	private String idUser;
	@Column(name = "name")
	String name;
	@Column(name = "surname")
	String surName;
	
	//@Email
	@Column(name = "email")
	String email;
	@Column(name = "address")
	String address;
	@Column(name = "subscription_date")
	Date subscriptionDate;
	
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	public Client(){}
    public Client( String idUser, String name, String surName, String email, 
    			   String address){
        this.idUser=idUser;
        this.name=name;
        this.surName=surName;
        this.email=email;
        this.address=address;        
    }
	
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
                "Client[id=%s, Nombre='%s', Apellido='%s', Email='%s', Dirección='%s']",
                id, name, email, address);
    }
}