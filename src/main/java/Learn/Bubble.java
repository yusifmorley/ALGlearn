package Learn;

//冒泡排序
//算法描述
//比较相邻的元素。如果第一个比第二个大，就交换他们两个。
//
//对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
//
//针对所有的元素重复以上的步骤，除了最后一个。
//
//持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
//时间复杂度 n^2 稳定
public class Bubble {
    public static void main(String[] args) {
        int temp;
        //每次循环 把最大的元素放在最后
        int [] arr={9,8,5,4,7,9,3,1,7,2};
        for(int i =0;i,<arr.lenth-1;;i++){
            for (int j=0;j<arr.lenth-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int e:arr
             ) {
            System.out.print(e+" ");
        }
    }
}
