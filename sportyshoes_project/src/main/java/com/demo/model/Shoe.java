package com.demo.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Shoe {

	@Id
	@GeneratedValue
	private int id;
	private String color;
	private int price;
	private String brand;
	
	
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="shoe_purchase",
	joinColumns = @JoinColumn(name="purchase_id"),
	inverseJoinColumns = @JoinColumn(name="user_id"))
	List<User> user = new ArrayList<>();
	
	
	
}
