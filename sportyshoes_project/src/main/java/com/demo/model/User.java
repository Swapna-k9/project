package com.demo.model;


import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int user_id;
		@Column(nullable=false)
		private String Username;
		@Column(nullable=false)
		@Email
		private String email;
		@Column(nullable=false)
		private String address;
		@Column(nullable=false)
		private int age;
		@Column(nullable=false)
		private String phoneNumber;
		@Column(nullable=false)
		private Date date;
		
		
		
		@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="shoe_id")
		
		private Shoe shoe_id;
		
		
}
