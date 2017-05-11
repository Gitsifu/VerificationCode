/**
 * Created by sifu on 2017/3/5.
 */
//获取六位数验证码
import java.util.*;
public class VerificationCode {
     final private  String SOURCE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
     private  StringBuilder sourse = new StringBuilder(SOURCE);
     StringBuilder vc = new StringBuilder();//验证码
    //生成六位数的验证码
    public StringBuilder getVC(){
        Random random = new Random(System.currentTimeMillis());
        for(int i = 1; i <= 6; i++) {
            int index = random.nextInt(61);//获取随机数
            char oneChar = sourse.charAt(index);
            vc = vc.append(oneChar);
        }
        return vc;
    }
}

class VerificationCodeDemo{
    public static void main(String[] args){
            VerificationCode t = new VerificationCode();
            StringBuilder source = t.getVC();
            System.out.println(source);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            //不区分大小比较
            if(s.equalsIgnoreCase(source.toString())) {
                System.out.println("输入正确");
            }else {
                System.out.println("输入错误");
            }



        }
}
