package com.cap.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="update_stock")   //creating a table with name update_stock
public class DandDEntity {
	//initializing datatype 
int order_id;
int manufac_date;
int expiry_date;
//invoking getter and setter methods
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getManufac_date() {
	return manufac_date;
}
public void setManufac_date(int manufac_date) {
	this.manufac_date = manufac_date;
}
public int getExpiry_date() {
	return expiry_date;
}
public void setExpiry_date(int expiry_date) {
	this.expiry_date = expiry_date;
}



}
