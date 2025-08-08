//Program to define abstract class
package javaday2.src.oops_abstractions;

//abstract class
public abstract class Shape {
     protected float area;
     
     //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
	 