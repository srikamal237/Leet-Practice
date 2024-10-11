package java.class_objects;

public class Car {
    private String company;
    private String model;
    private int year;
    private int amount;
   public Car(String company,String model,int year) {
        this.company = company;
        this.model = model;
        this.year = year;
        //this.amount = amount;
   }


   public void display(){
    System.out.println(year+" "+company+" "+model);
   }

   public void start(){
    System.out.println("The "+company+" "+model+" is starting!");
   }

   public void carPrice(int amount){
    System.err.println("The Car Price starting from "+amount+" Lakhs");
    System.out.println();

   }


   public static void main(String[] args){

    Car c1=new Car("Honda","Civic",2018);
    Car c2=new Car("Toyato","Suv",2015);

    c1.display();
    c1.start();
    c1.carPrice(8);

    c2.display();
    c2.start();
    c1.carPrice(15);

   }

}
