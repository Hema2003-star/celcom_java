package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient private int emp_Id ;  // the transient make the variable as not serializable
	private String emp_Name ;
	private double emp_Salary ;
	
	//constructor
	public Employee(int emp_Id, String emp_Name, double emp_Salary) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
	}
	
	//getter and setter methods
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	
	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public double getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(double emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
	
	
	
	
}
public class Serialization1 {
	public static void main(String[] args) throws Exception {
		
		
		//Serialization
		Employee e = new Employee(1,"hema",30000);  //create object
		
		FileOutputStream fo = new FileOutputStream("D:\\ObjectFile.txt"); 
		//we are creating the file name as - objectfile (.txt)
		
		ObjectOutputStream oo = new ObjectOutputStream(fo); //converting the .txt to object writable mode
		
		oo.writeObject(e);  // writing the employee detail to that object
		
		oo.close();
		fo.close();
		
		System.out.println("object saved into file");
		System.out.println(" ");
		System.out.println("-------------------");
		
		
		//deserialization
		
		FileInputStream fin = new FileInputStream("D:\\ObjectFile.txt");
		
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Employee e1 =(Employee)oin.readObject();  //returing the object so type cate into employee type 
		
		oin.close();
		fin.close();
		
		System.out.println("Employee id : " +e1.getEmp_Id());
		System.out.println("Employee name : " +e1.getEmp_Name());
		System.out.println("Employee salary : " +e1.getEmp_Salary());
		
		
	}
}
