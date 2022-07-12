package Array;

import java.util.Scanner;

public class Array_Of_Operation {
    public void MaxFromTheArray(int []array,int num)
    {
        int a=array[0];
        for(int i=1;i<num;i++)
        {
            if(a<array[i])
            {
                a=array[i];
            }
        }
        System.out.println("The max num from the students is = "+a);
    }
    public void addFunction(int []array,int num)
    {
        int total=0;
        for(int i=0;i<num;i++) {
            total+=array[i];
        }
        System.out.println("Total is ="+total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total students Number ");
        int num = sc.nextInt();
        System.out.println("Enter Students numbers ");
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        Array_Of_Operation a = new Array_Of_Operation();
        a.addFunction(array,num);
        a.MaxFromTheArray(array,num);
    }
}
