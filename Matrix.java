import java.util.Scanner;

public class Matrix {


    public static void main(String[] args){


     Scanner sc=new Scanner(System.in);
     int [][] mat=new int[3][3];
     System.out.println("Enter the matrix: ");

     for(int i=0;i<3;i++)
     {
        for (int j=0;j<3;j++)
        {
            mat[i][j]=sc.nextInt();
        }
     }

     for(int i=0;i<3;i++)
     {
        for (int j=0;j<3;j++)
        {
           // if(i==j)
                System.out.print(" "+mat[i][j]);
        }
        System.out.println();
     }

    }

}
