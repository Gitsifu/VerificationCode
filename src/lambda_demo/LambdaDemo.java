package lambda_demo;

/**
 * Created by sifu on 2017/4/8.
 */


interface Sumable {
    int sum(int[] arr);
}

public class LambdaDemo {

    public void add(Sumable s) {
        int sum = s.sum(new int[]{1, 3, 2, 4, 5});
        System.out.println(sum);
    }

    public static void main(String[] args) {
        LambdaDemo ld = new LambdaDemo();

        ld.add((arr) ->{
            int sum = 0;
            for(int a : arr){
                sum += a;
            }
            return sum;
        });
    }
}
