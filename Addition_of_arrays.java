package Array;

import java.util.Scanner;

public class Addition_of_arrays {
    int row,col;
    int first[][];
    int second[][];
    Addition_of_arrays(int [][]first,int [][]second,int row,int col){
        this.first=first;
        this.second=second;
        this.row=row;
        this.col=col;
    }
    public void The_addition_Function()
    {
        int[][]sum=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=first[i][j]+second[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your row");
        int row =sc.nextInt();
        System.out.println("Enter your column ");
        int col=sc.nextInt();
        System.out.println("Enter your first matrix");
        int first[][]=new int[row][col];
        int second[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter your second matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
        Addition_of_arrays a =new Addition_of_arrays(first,second,row,col);
        System.out.println("The summation will be in "+row+"x"+col+" matrix ");
        a.The_addition_Function();
    }
}
