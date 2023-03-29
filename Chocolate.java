package com;

public class Chocolate {
int cost;
String name;
double price;
Chocolate(int cost){
	this.cost=cost;
	
}
Chocolate(int cost,String name){
	this(cost);
	this.name=name;
	
}
Chocolate(int cost,String name,double price){
	this(cost,name);
	this.price=price;
	
}
}
