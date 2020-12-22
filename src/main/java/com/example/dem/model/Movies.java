package com.example.dem.model;

import java.awt.Color;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movies {
	@Id
	@Column(length = 50,nullable = false,unique = true)
private String titel;
	@Column(length = 10)
private int year;
	@Column(length = 11)
	private int length;
@Column(length = 1,unique = true)
private Color color;
@Column(length = 20)
@OneToOne
private String studio;

public String getTitel() {
	return titel;
}
public void setTitel(String titel) {
	this.titel = titel;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
public String getStudio() {
	return studio;
}
public void setStudio(String studio) {
	this.studio = studio;
}
public Movies() {
	super();
}

@Override
public String toString() {
	return "Movies [titel=" + titel + ", year=" + year + ", length=" + length + ", color=" + color + ", studio="
			+ studio + "]";
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}


}
