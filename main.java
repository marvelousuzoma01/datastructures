
public class Fib {

    public static void main(String[] args) {
        int start = 0;
        int first = 1;
        int temp;
        System.out.println(start);
        System.out.println(first);
        for (int i = 2; i < 10; i++) {
            temp = start + first;
            System.out.println(temp);
            start = first;
            first = temp;
        }
    }
}
