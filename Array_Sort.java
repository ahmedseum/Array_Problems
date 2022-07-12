package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        System.out.println("Enter your Sentence ");
        Scanner sc= new Scanner(System.in);
        String Sentence[]={
                "I","am","a","Disco","Dancer"};
        Arrays.sort(Sentence);
        for(int i=0;i<Sentence.length;i++)
        {
            System.out.println(Arrays.deepToString(Sentence));
        }
    }
}
