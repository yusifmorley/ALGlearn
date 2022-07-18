
//选择排序
//（选择最大或最小元素放到最前或最后）
public class ChooseSort { //从小到大
    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,19};
        sort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
        
    }
    public  static  void  sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {  //前面和 后面的数组 比较
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[min]>arr[j])
                    min=j;
            }
            int temp;
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }


    }
}
