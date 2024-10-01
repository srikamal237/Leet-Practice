package JAVA;

public class Car {
    private String company;
    private String model;
    private int year;
   public Car(String company,String model,int year){
        this.company = company;
        this.model = model;
        this.year = year;
   }


   public void display(){
    System.out.println(year+" "+company+" "+model);
   }

   public void start(){
    
    System.out.println("The "+company+" "+model+" is starting!");

   }

   public static void main(String[] args){

    Car c1=new Car("Honda","Civic",2018);
    Car c2=new Car("Toyato","Suv",2015);

    c1.display();
    c1.start();

    c2.display();
    c2.start();

   }

}
