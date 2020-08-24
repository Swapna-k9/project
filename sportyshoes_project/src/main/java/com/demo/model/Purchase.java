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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="purchase")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(nullable=false)
	private int purchase_id;
	@Column(nullable=false)
	private int totalamount;
	@Column(nullable=false)
	private Date date; 
	
	

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="cart_id")
	
	private Cart cart_id;
	
}
