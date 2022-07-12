package Array;

public class Coppy_array {
    public static void main(String[] args) {
        char []copyFrom={'a','b','a','h','m','e','d','s','e','u','m'};
        char [] copyTo=new char[9];
        System.arraycopy(copyFrom,2,copyTo,0,9);
        System.out.println(new String(copyTo));
    }
}
