package Learn;

//希尔排序
//希尔排序是基于插入排序的以下两点性质而提出改进方法的：
//    1.插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率；
//    2.但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位；
//希尔排序的基本思想是：
//              先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
//              待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。
public class Shell {
    public static void main(String[] args) {
     int[] arr={9,8,6,2,3,1,5,6};
     int length=arr.length;
     int current;
     /*
1. int step=length/2       将数组分为两段
2. step>=1
3. step/=2             每次以 二分之一长度 缩减
      */
        for (int step=length/2;step>=1;step/=2){
            System.out.println("++++++++++++++++++"+step);
         for (int i=step;i<length;i++){    //分别 从 length/2开始到length  从length/2/2开始到length  从length/2/2/2开始到length ....  进行插入排序
              current= arr[i];   //记录(保存 arr[i])
             int j = i - step;
             while (j >= 0 && arr[j] > current) {   //在0 到 j=i-step   中 寻找 比temp 大的元素
                 arr[j + step] = arr[j];     // j 元素 以 step 向后 移动
                 j -= step;             //j 以 step 递减
             }
             arr[j + step] =current ;
         }
        }
        for (int s : arr) {
            System.out.println(s);
        }
    }
}
