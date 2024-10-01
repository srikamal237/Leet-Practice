package Array;
public class ExampleClass{

    int count,width,height;
    ExampleClass()
    {
         count=10;
         width=28;
         height=50;
    }

    public int volum()
    {
        return count*width*height;
    }
    public static void main(String[] args)
   {
        ExampleClass ex=new ExampleClass();

        int vol=ex.volum();
        System.out.println("volume = "+vol);
   }
}