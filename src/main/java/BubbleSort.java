//冒泡排序 较大的数上浮
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,19};
        sort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
    }
    static  void  sort(int[] arr){
        for (int i = 1; i < arr.length; i++) { //起标记作用
            for (int j = 0; j < arr.length-i; j++) {  //后i个数 不用排序
                                                      //每次遍历后 最大数都被放在后面
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

}
