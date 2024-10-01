package JAVA;

public class ClassandObjects {

     static String name;
     static int roll_no;
     static int salary;
     ClassandObjects(String name, int roll_no, int salary)
     {
        this.name=name;
        this.roll_no=roll_no;
        this.salary=salary;
     }
    public static void main(String[] args){

        ClassandObjects claz=new ClassandObjects("kamal",23,4);
       
        System.out.println(claz.name);
        System.out.println(claz.roll_no);
        System.out.println(claz.salary);

        ClassandObjects claz2=new ClassandObjects("jega",17,40000);

        System.out.println(claz2.name);
        System.out.println(claz2.roll_no);
        System.out.println(claz2.salary);


    }
}
