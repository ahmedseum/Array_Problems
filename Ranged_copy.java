package Array;

public class Ranged_copy {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'b', 'a', 'h', 'm', 'e', 'd', 's', 'e', 'u', 'm'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,11);
        System.out.println(new String(copyTo));
    }
}
