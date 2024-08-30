import java.util.Scanner;

public class buySellStock {
    
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
       int[] arr=new int[]{7,1,5,3,6,4};

       int min=Integer.MAX_VALUE;
       int profit=0;
       for(int a:arr){
            if(a<min){
                min=a;
       }
       int check=a-min;

       if(check>profit){
        
       profit=check;
        }
      }

      System.out.println("Result : "+profit);

    }


}
