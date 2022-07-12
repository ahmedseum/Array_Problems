package Array;

import java.util.Scanner;

public class Double_matrix {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        int numbers[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(numbers[i][j]+"\t");
            }
            System.out.println(" ");
        }
        for(int i=0;i<col;i++)
        {
            int sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=numbers[j][i];
            }
            System.out.println("The dum of column of "+i+" is = "+sum);
        }

    }
}
