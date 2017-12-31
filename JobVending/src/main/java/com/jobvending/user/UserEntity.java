package com.jobvending.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name= "user", catalog = "jobvending")
public class UserEntity{
	
	public UserEntity(){
		
	}
	
	public UserEntity(String user_key){
		
		this.user_key=user_key;
		
	}
	
	@Id
	@GeneratedValue
	int id;
	
	@Column(name = "user_key")
	String  user_key;

}
