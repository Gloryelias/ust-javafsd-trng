package com.ust;
 //firstNameBillOfThePatient
public class Student {
 int SID;
 String name;
 int age;
 String course;
 static int count;
 
//public Student() {
	//constructors dont have return type
//	

 {
	 int z;
	 System.out.println(z=7);
	 
 }
 
 public static void main(String args[]) {
 int x=10;

 String str;
 Student s=new Student();   //default constructor/zero arg  constructor
 Student s1=new Student();
 Student s2=new Student();
 Student s3=new Student();
 s.age=22;
 System.out.println(s.age);
 System.out.println(x);
 s.count=15;
 s1.age=25;
 System.out.println(s1.age);
 System.out.println(s.count);
 System.out.println(s1.count);
  }
 }
 
