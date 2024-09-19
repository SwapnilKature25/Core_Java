package com.nit.polymorphism.Sept12;

class Parent {   
    void showMessage()   
   {   
       System.out.println("Parent method is called");   
   }   
}   
   
class Child extends Parent {   
    @Override  
   void showMessage()   
   {   
       System.out.println("Child method is called");   
   }   
}   
   
public class Downcasting{  
   
   public static void main(String[] args)   
   {   
       Parent p = new Child();    
                 
       Child c = (Child)p;     
       c.showMessage();   
   }   
}  


//Child method is called

