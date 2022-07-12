package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondDimention_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Row number");
        int row=sc.nextInt();
        System.out.println("Enter your Column number");
        int col=sc.nextInt();
        System.out.println("Enter "+row+" x "+col+" integer numbers =");
        int array[][]=new int[row][col];
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
