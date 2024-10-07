package multithreading;
class Demo{
	public void fun1() {
		System.out.println("this is fun1");
	}
	public void fun2() {
		System.out.println("this is fun2");
	}
	
}
class Multithread extends Thread
{    //   child            parent
	Demo demo1=new Demo();
	public void run() {
    demo1.fun1();
    demo1.fun2();
	           //overriding thread class method
	 long id = Thread.currentThread().getId();
     String name = Thread.currentThread().getName();
     System.out.println("Thread ID: " + id);
     System.out.println("Thread Name: " + name);
     System.out.println("====================");
		
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) {
	//	Multithread thread1=new Multithread();
	//	thread1.start();  //will call run()
	//System.out.println("====================");
		//Multithread thread2=new Multithread();
		//thread2.start();
		//System.out.println("=====================");
		//Multithread thread3=new Multithread();
		//thread3.start();
		//System.out.println("=====================");
		
		for(int i=0;i<7;i++) {
			Multithread thread1=new Multithread();
				thread1.start();  //will call run()
			System.out.println("====================");
		}
		
		
		
	}
	
	
	

}
