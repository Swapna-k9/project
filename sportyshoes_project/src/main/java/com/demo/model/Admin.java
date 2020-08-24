package com.demo.model;





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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="admin")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Admin {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	@Column(nullable=false)
	@NotEmpty
	@Min(6)
	private String adminname;
	@Column(nullable=false) 
	@NotEmpty
	@Min(8)
	private String password;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	
	private User user_id;
	
}
