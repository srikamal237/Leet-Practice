

class Parent{
	
	protected String message="Hello from the Parent class";
	void display()
	{
		System.out.println(message);
	}
}

class Child extends Parent{
	
	@Override
	void display()
	{
		super.display();
		System.out.println(message);
	}
	
	
	
}


public class ProtectedMain {

	public static void main(String[] args) {

			Child child=new Child();
			child.display();
	}

}
