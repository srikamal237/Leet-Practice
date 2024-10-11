package javacode.class_objects;

class ObjectCreation {
    
    String name;
    int id;
    ObjectCreation(String name, int id) {
       this.name=name;
       this.id=id;
   }

   void display()
   {
       System.out.println("The data of Name: " + name + "Id: " + id);
   }

}

public class Main{
    public static void main(String[] args)
    {
        ObjectCreation o1 = new ObjectCreation("Alice",10);
        ObjectCreation o2 = new ObjectCreation("bob",20);
        o1.display();
        o2.display();
    }
}