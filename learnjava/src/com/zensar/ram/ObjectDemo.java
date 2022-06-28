package com.zensar.ram;

public class ObjectDemo extends Object
{
public static void main(String[] args)
{
Circle c = new Circle(5);
Figure f = c; // SUPER = SUB CLASS
Object obj = c; // SUPER = SUB CLASS
// with base class variable , only base class functions
// obj.area(); // ERROR : there is no area function in object class
obj.equals("hello");
Class<? extends Object> class1 = obj.getClass();
System.out.println(class1.getName());

int hashCode = obj.hashCode();
System.out.println("hash code of circle " + hashCode);
System.out.println(c);
String string = obj.toString(); //Run time polymorphism

System.out.println(string);



/* Object is super class of all classes */


}

}


/*
 * Library management system
 * 
 *  classes => staff class, student class, account class
 *  Data members => list of books, usertype, author
 *  methods => register(), login id()
 *   
 *   */





