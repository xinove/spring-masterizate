package com.creativate.masterizate.model.objects;
 
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
//import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users", catalog = "masterizate"
		//, uniqueConstraints = {
		//@UniqueConstraint(columnNames = "STOCK_NAME"),
		//@UniqueConstraint(columnNames = "STOCK_CODE") }
)
public class User {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user",unique=true, nullable = false)
	private String id;
	private String username;
	
	@NotNull
    @Size(min = 6, max = 15)
	private String password;

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