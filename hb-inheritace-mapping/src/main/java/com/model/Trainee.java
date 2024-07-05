package com.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="trainee")
public class Trainee extends Employee {
float payperhour;
String Contractperiod;
public Trainee(float payperhour, String contractperiod,String name) {
	super(name);
	this.payperhour = payperhour;
	Contractperiod = contractperiod;
}
public Trainee() {
	super();
}
public float getPayperhour() {
	return payperhour;
}
public void setPayperhour(float payperhour) {
	this.payperhour = payperhour;
}
public String getContractperiod() {
	return Contractperiod;
}
public void setContractperiod(String contractperiod) {
	Contractperiod = contractperiod;
}
}
