package com.phoneshopmanagement.Enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id", nullable = false)
	private Integer id;

	@Column(name = "brand_name")
	private String name;

	 public void setId(Integer id) {
	 	this.id = id;
	 }

	 public void setName(String name) {
	 	this.name = name;
	 }

	 public Integer getId() {
	 	return id;
	 }

	 public String getName() {
	 	return name;
	 }

}
