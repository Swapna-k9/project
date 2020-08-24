package com.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="category")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_id;
	@Column(nullable=false)
	private String name;
	
	
	
	
	
}
