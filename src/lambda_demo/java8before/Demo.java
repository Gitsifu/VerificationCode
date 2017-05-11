package lambda_demo.java8before;

/**
 * Created by sifu on 2017/4/8.
 */
class Add {
    public int add(int[] arr) {
        return 0;
    }
}

public class Demo {
    public static int sum(Add a) {
        return a.add(new int[]{1, 2, 3, 4, 5});
    }

    public static void main(String[] args) {
        int sum = sum(new Add() {
            public int add(int[] arr) {
                int sum = 0;
                for (int a : arr) {
                    sum += a;
                }
                return sum;
            }
        });
        System.out.println(sum);
    }
}
