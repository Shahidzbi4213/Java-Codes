
/*
 							"Java Garbage Collection"
 
  1). In java, garbage means unreferenced objects.
  
  2). Garbage Collection is process of reclaiming the runtime unused memory automatically.
      In other words, it is a way to destroy the unused objects.
  
  3). To do so, we were using free() function in C language and delete() in C++. But, in 
      java it is performed automatically. So, java provides better memory management.
  
  4). Advantage of Garbage Collection : 
  			a). It makes java memory efficient because garbage collector removes the unreferenced
  			    objects from heap memory.
            b). It is automatically done by the garbage collector(a part of JVM) so we don't need
                 to make extra efforts.
  
  5). How can an object be unreferenced?
  			There are many ways:
					1). By null the reference { (Employee e=new Employee(); e=null; }
					 
					2). By assigning a reference to another 
					            Employee e1=new Employee();  
								Employee e2=new Employee();  
								e1=e2; //now the first object referred by e1 for garbage
								
					3). By anonymous object etc. { new Employee(); }  
					  
  6). The finalize() method is invoked each time before the object is garbage collected.
      This method can be used to perform cleanup processing. This method is defined in Object
       class as:  
       				protected void finalize() throws throwable {}  
  
  7). The gc() method is used to invoke the garbage collector to perform cleanup processing.
      The gc() is found in System and Runtime classes.
      							 public static void gc(){}  

  8). Garbage collection is performed by a daemon thread called Garbage Collector(GC).
      This thread calls the finalize() method before object is garbage collected.
  
  9). Neither finalization nor garbage collection is guaranteed.
  
  10). The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc().
  
 */


package garbageCollection;

public class Garbage 
{
	    @Override
	    /* finalize method is called on object once  
	     before garbage collecting it */
		 public void finalize() throws Exception
		 {
			 System.out.println("object is garbage collected");
			 
		 }  
		 
		public static void main(String args[])
		 {  
		
		//Creating  the objects
		  //Garbage s1=new Garbage();		  
		  //Garbage s2=new Garbage(); 
		  
		// Nullifying the reference variable 
		  //s1=null; 
		  
	   // requesting JVM for running Garbage Collector
		  System.gc();
		  
	  // Nullifying the reference variable  
		 // s2=null;  
		  
	 // requesting JVM for running Garbage Collector 
	     Runtime.getRuntime().gc(); 
		  
		 }  
}
