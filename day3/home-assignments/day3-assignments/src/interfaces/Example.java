package interfaces;
/**
 * 
 * @author bvdam
 *
 */

//creating two interfaces infA and infB
interface intfA 
{ 
    void m1(); 
} 
  
interface intfB 
{ 
    void m2(); 
} 

//Main Class implementing both interfaces
class Example implements intfA, intfB 
{ 
    @Override
    public void m1() 
    { 
        System.out.println("Welcome to the method m1,its working."); 
    } 
  
    @Override
    public void m2() 
    { 
        System.out.println("Welcome to the method m2, its perfect"); 
    } 

    public static void main (String[] args) 
    { 
    	Example ob1 = new Example(); 

    	//Calling the methods in the class
        ob1.m1(); 
        ob1.m2(); 
    } 
} 
