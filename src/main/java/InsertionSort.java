
// 插入排序

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,19};
        sort(arr);
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
    public static void sort(int [] list){  //实现
        for (int i = 1; i < list.length; i++) { //从第二位开始遍历
            int current=list[i];                //抽出 current
            int k;
            for (k=i-1;k>=0 && list[k]>current;k--){ //k的范围为 0- i-1
                list[k+1]=list[k];                    //寻找 插入位置  把不符合的插入位置向后移动
            }
            list[k+1] =current;                       //插入
        }
    }
}
