<<<<<<< HEAD
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
=======
package JAVA;

public class ClassandObjects {

      String name;
      int roll_no;
      int salary;

     ClassandObjects(String name, int roll_no, int salary)
     {
        this.name=name;
        this.roll_no=roll_no;
        this.salary=salary;
     }

    public static void main(String[] args){

        ClassandObjects claz=new ClassandObjects("kamal",23,4);
        ClassandObjects claz2=new ClassandObjects("jega",17,40000);
        ClassandObjects claz3=new ClassandObjects("amma",25,50000);
       
        System.out.println(claz.name+ " "+claz.roll_no+ " "+claz.salary);
        System.out.println(claz2.name+ " "+claz2.roll_no+ " "+claz2.salary);
        System.out.println(claz3.name+ " "+claz3.roll_no+ " "+claz3.salary);



        



    }
}
>>>>>>> b21bc93 (update)
