//归并排序
// 1，申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
// 2，设定两个指针，最初位置分别为两个已经排序序列的起始位置；
// 3，  比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
// 4，重复步骤 3 直到某一指针达到序列尾；
// 5，将另一序列剩下的所有元素直接复制到合并序列尾。

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,26,98};
        mergesort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
    }
    static  void  mergesort(int[] arr){
          if (arr.length>1){
              int[] firstHalf=new int[arr.length/2] ;
              System.arraycopy(arr,0,firstHalf,0,arr.length/2);
              mergesort(firstHalf);

              int secondHalfLength=arr.length-arr.length/2;
              int [] secondHalf=new  int[secondHalfLength];
              System.arraycopy(arr,arr.length/2,secondHalf,0,secondHalfLength);
              mergesort(secondHalf);

              merge(firstHalf,secondHalf,arr);
          }
    }

    static  void merge(int[] list1,int[] list2,int[] temp){
        int current1=0;
        int current2=0;
        int current3=0;

        while (current1< list1.length&&current2< list2.length){
            if(list1[current1]< list2[current2])
                temp[current3++]=list1[current1++];
            else
                temp[current3++]=list2[current2++];
        }

        while (current1<list1.length)
            temp[current3++]=list1[current1++];

        while (current2< list2.length)
            temp[current3++]=list2[current2++];
    }

}
