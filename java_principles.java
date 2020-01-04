//JAVA PRINCIPLES'S EXAMPLES

//ABSTRACTION

abstract class Shape  
{ 
    String color; 
    abstract double area(); 
    public abstract String toString(); 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
}
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
} 
public class Test  
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 
} 



//ENCAPSULATION

public class Encapsulate 
{ 
    private String geekName; 
    private int geekRoll; 
    private int geekAge; 
  
    public int getAge()  
    { 
      return geekAge; 
    } 
   
    public String getName()  
    { 
      return geekName; 
    } 
      
    public int getRoll()  
    { 
       return geekRoll; 
    } 
   
    public void setAge( int newAge) 
    { 
      geekAge = newAge; 
    } 
   
    public void setName(String newName) 
    { 
      geekName = newName; 
    } 
      
    public void setRoll( int newRoll)  
    { 
      geekRoll = newRoll; 
    } 
} 



//INHERITANCE

//1) Single Inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class one 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        two g = new two(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    } 
}

//2) Multilevel Inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class one 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        two g = new two(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    } 
}

//3) Hierarchial Inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class one 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
  
class three extends one 
{ 
    /*............*/
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_geek(); 
        two t = new two(); 
        t.print_for(); 
        g.print_geek(); 
    } 
} 

//4) Multiple Inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
   
interface one 
{ 
    public void print_geek(); 
} 
   
interface two 
{ 
    public void print_for(); 
} 
   
interface three extends one,two 
{ 
    public void print_geek(); 
} 
class child implements three 
{ 
    @Override
    public void print_geek() { 
        System.out.println("Geeks"); 
    } 
   
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        child c = new child(); 
        c.print_geek(); 
        c.print_for(); 
        c.print_geek(); 
    } 
} 

//5) Hybrid Inheritance: (can only be achieved through Interfaces)



//Polymorphism

//1) Compile time Polymorphism
class MultiplyFun { 

    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
  
        System.out.println(MultiplyFun.Multiply(2, 4)); 
  
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
    } 
}

//2) Runtime Polymorphism
class Parent { 
  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass2"); 
    } 
} 
  
class TestPolymorphism3 { 
    public static void main(String[] args) 
    { 
  
        Parent a; 
  
        a = new subclass1(); 
        a.Print(); 
  
        a = new subclass2(); 
        a.Print(); 
    } 
} 