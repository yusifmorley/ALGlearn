//递归算法 算斐波那契额数列
public class Useme {

    public static void main(String[] args) {
        System.out.println(f(40));

    }

    public  static int  f(int n){
        if (n==1){
            return 1;  //递归出口
        } else if (n==2) {
            return 2;//递归出口
        } else {
            return f(n-1)+f(n-2); //递归关系
        }
    }

}
