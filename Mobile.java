package com;

public class Mobile {
int id;
String brand;
double cost;
Mobile(int id){
	this.id=id;
	
}
Mobile(int id,String brand){
	this(id);
	this.brand=brand;
	
}
Mobile(int id,String brand,double cost){
	this(id,brand);
	this.cost=cost;
}
}
