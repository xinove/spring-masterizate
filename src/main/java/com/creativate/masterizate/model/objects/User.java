package com.creativate.masterizate.model.objects;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", catalog = "masterizate", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })
public class User {
 
	@Id
	private String id;
	String username;
 
	String password;

	public User(){}
    public User( String username, String password){
        this.username=username;
        this.password=password;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, usuario='%s', Contrase�a='%s']",
                id, username, password);
    }
 
 
}