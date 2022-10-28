package Learn;
//插入排序
//1. 算法步骤
//2.将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
//3.从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）

//插入排序 把整个序列 分为有序序列 把无序序列 的元素依次插入 到有序序列中
//时间复杂度 为n^2 稳定
public class Insert {
    public static void main(String[] args) {
    int [] arr ={2,3,6,5,4,8,5,4,5,3,1};
    int current;
        for (int i = 1; i <arr.length ; i++) {//从1 开始 因为默认第一个是有序的
            current=arr[i]; //保存arr[i]值  为等待 插入的元素
                            // arr[i] 位置可以腾出来 供有序序列 向右移动
            for (int j = i-1; j >=0 ; j--) {
                  //j 为有序序列最后一个
                  if (arr[j]>current){  //与current比较
                      arr[j+1]=arr[j];   //元素后移
                  }//current
                   else {
                   arr[j]=current;
                  }
            }
        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
