package com.example.dem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Studios")
public class Studio {
	@Id
	private String name;
	private String address;
	@OneToOne
	private Studio studio;
}
