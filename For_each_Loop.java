package Array;

import java.util.Scanner;

public class For_each_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int num:array)
        {
            System.out.println(num);
        }
    }
}

