package com.Jspiders.java_practice;

public class ExcelProgram {
	private String data;
	//Design a getData()used to read /fetch the data which is already written
 public String getData()
 {
	 return data;
 }
 //Design a getData() used as a setter method so we can write into the cell
 public void writeData(String data)
 {
	 this.data=data;
 }
 //Design a delete() used to delete data from the cell
 public void delete()
 {
	 this.data="";
	 System.out.println("Data is deleted");
 }
 @Override
 public String toString() {
	 return "Data =" + data;
 }
 @Override
 public boolean equals(Object o)
 {
	 ExcelProgram temp=(ExcelProgram)o;//downcasting
	 return this.data.equals(temp.data);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ExcelProgram c1=new ExcelProgram();
    c1.writeData("Hello");
    ExcelProgram c2=new ExcelProgram();
    c2.writeData("Hello");
    //to display data
    System.out.println(c1.getData());
    System.out.println(c2.getData());
    System.out.println(c1.getData());
    c2.delete();
    System.out.println(c2);
    c2.writeData("hi");
    System.out.println(c2.getData());
    System.out.println(c1.equals(c2));
    
	}

}
