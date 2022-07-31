//希尔排序 是基于 插入排序 改进后的算法
// 设定缩进量  对数组进行分组 每一组进行 插入排序
public class ShellSort {

    public static  void sort(int [] list){
        for (int h = list.length/2;h>0 ; h/=2) {
           for (int i = h; i < list.length; i++) {
              int current=list[i];            //抽出 current
              int k;
              for (k=i-h;k>=0 && list[k]>current;k-=h){
                    list[k+h]=list[k];                    //寻找 插入位置  把不符合的插入位置向后移动
              }
                list[k+h] =current;                       //插入
         }

    }

    }

    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,19};
        sort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
    }
}
