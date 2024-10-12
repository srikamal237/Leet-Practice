package javacode.inheritences;

class Animal{
	
	String name;
	
	Animal(String name)
	{
		this.name=name;
	}
	
	
	void eat()
	{
		System.out.println(name+" is eating");
	}
}

class Dog extends Animal{
	
	String breed;
	
	Dog(String name,String breed)
	{
		super(name);
		this.breed=breed;
	}
	
	void bark() {
		System.out.println(breed+" is barking");
	}

	@Override
	void eat()
	{
		System.out.println(name+" is eating dog food");
	}
	
}


public class MainAnimal {

	public static void main(String[] args) {
		
		Dog d=new Dog("oreo","Shizu");
		d.bark();
		d.eat();
	}

}
