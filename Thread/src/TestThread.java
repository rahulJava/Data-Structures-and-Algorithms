public class TestThread {
   
	  static Object obj1 = new Object();
      static Object obj2 = new Object();
   public static void main(String args[]) {
	 
      ThreadDemo1 T1 = new ThreadDemo1();
      ThreadDemo2 T2 = new ThreadDemo2();
      Thread t1 = new Thread(T1);
      Thread t2 = new Thread(T2);
      t1.start();
      t2.start();
   }
   
   
}
 class ThreadDemo1 implements Runnable {
   
	Object obj1 = TestThread.obj1;
	Object obj2 = TestThread.obj2;
	
	 public void run() {
       synchronized (obj1) {
          System.out.println("Thread 1: Holding lock 1...");
          
          try { Thread.sleep(10); }
          catch (InterruptedException e) {}
          System.out.println("Thread 1: Waiting for lock 2...");
          
          synchronized (obj2) {
             System.out.println("Thread 1: Holding lock 1 & 2...");
          }
       }
    }
 }
 class ThreadDemo2 implements Runnable {
	   
	Object obj1 = TestThread.obj1;
	Object obj2 = TestThread.obj2;
	
	 public void run() {
       synchronized (obj2) {
          System.out.println("Thread 2: Holding lock 2...");
          
          try { Thread.sleep(10); }
          catch (InterruptedException e) {}
          System.out.println("Thread 2: Waiting for lock 1...");
          
          synchronized (obj1) {
             System.out.println("Thread 2: Holding lock 1 & 2...");
          }
       }
    }
 }