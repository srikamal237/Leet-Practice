package javacode.Interface;

	
public class InterfaceMain implements Aniruth{
	
	public void eat()
	{
		System.out.println("cat is Eating rightnow");
	}
	
	public void sleep(){
		System.out.println("cat is SLEEPgvgvING rightnow");
	}
	
public static void main(String[] args) {
		
	InterfaceMain ar=new InterfaceMain();
		ar.eat();
		ar.sleep();
		Aniruth.Sing();
	
}




}
