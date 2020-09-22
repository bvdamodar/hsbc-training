package com.practice.threads.q9;
/**
 * 
 * @author bvdam
 *
 */
public class ThreadPriority extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run."); 
    } 
  
    public static void main(String[]args) 
    { 
    	
    	
    	
        //3 Self Threads
        ThreadPriority t1 = new ThreadPriority(); 
        ThreadPriority t2 = new ThreadPriority(); 
        ThreadPriority t3 = new ThreadPriority(); 
  
        System.out.println("t1 thread priority Initially: " + t1.getPriority()); 
        System.out.println("t2 thread priority Initially: " + t2.getPriority());
        System.out.println("t3 thread priority Initially: " + t3.getPriority());
  
        t1.setPriority(2); 
        t2.setPriority(5); 
        t3.setPriority(8); 
  
        System.out.println("\nt1 thread priority after Set: " + t1.getPriority()); 
        System.out.println("t2 thread priority after Set: " + t2.getPriority());
        System.out.println("t3 thread priority after Set: " + t3.getPriority());
  
        Thread  t = Thread.currentThread();
        System.out.print("\n"+t.getName()); 
        System.out.println("\nMain thread priority Initially: "+ Thread.currentThread().getPriority()); 
  
        t.setPriority(10); 
        System.out.println("Main thread priority after Set: " + Thread.currentThread().getPriority()); 
        
    } 
} 