package com.example.dem.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.Table;
@Entity
@Table(name = "stars")
public class Stars {
	@Id
	@Column(length=50)
private String name;

	@Column(length = 70)
private String addresse;
	
private char gender;

private LocalDate birthday;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddresse() {
	return addresse;
}
public void setAddresse(String addresse) {
	this.addresse = addresse;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public LocalDate getBirthday() {
	return birthday;
}
public void setBirthday(LocalDate birthday) {
	this.birthday = birthday;
}
public Stars() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
	result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
	result = prime * result + gender;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Stars other = (Stars) obj;
	if (addresse == null) {
		if (other.addresse != null)
			return false;
	} else if (!addresse.equals(other.addresse))
		return false;
	if (birthday == null) {
		if (other.birthday != null)
			return false;
	} else if (!birthday.equals(other.birthday))
		return false;
	if (gender != other.gender)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}
