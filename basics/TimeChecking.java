/*
   We can measure the time taken by a function in Java with the help of
   java.lang.System.currentTimeMillis() method. This method returns the
   current time in millisecond. We can call this method at the beginning
   and at the end of function and by the difference we measure the time 
   taken by the function.
 */


package basics;
//import java.io.*;
public class TimeChecking 
{ 
    public static void main(String[] args) 
    { 
        // starting time 
        long start = System.currentTimeMillis(); 
       
        // start of function 
  
        count_function(10000000); 
  
        // end of function 
  
        // ending time 
        long end = System.currentTimeMillis(); 
        System.out.println("Counting to 10000000 takes " + 
                                    (end - start) + "ms"); 
    } 
  
    // A function that runs a loop x times 
    public static void count_function(long x) 
    { 
        System.out.println("Loop starts"); 
        for (long i = 0; i < x; i++); 
        System.out.println("Loop ends"); 
    } 
    
} 