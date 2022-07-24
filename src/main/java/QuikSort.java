//1,从数组选取基准元素
//2，分区过程：将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
//3，再对左右区间重复第二步，直到各区间只有一个数
public class QuikSort {


    public static void quicksort(int [] list){
        quicksort(list,0,list.length-1);
    }

public  static  void  quicksort(int [] list ,int first ,int last){
    if(last>first){
        int prvotindex=partition(list,first,last); //使用基准元素划分数组
        //递归划分数组
     quicksort(list,first,prvotindex-1);
     quicksort(list,prvotindex+1,last);
    }
}

public static  int partition(int [] list,int first,int last){
    int privot=list[first]; //默认选择第一个元素作为 基准元素
    //指定范围 low - high
    int low=first+1;  //第一个搜索位置
    int high=last; //最后搜索位置

    while (high>low){ //高位 低位错开  通过++ --扫描  数组
        while (low<=high && list[low]<=privot)
            low++;                     //找到一个比基准小的
        while (low<=high && list[high]>privot)
            high--;                    //找到一个比基准元素大的
        if (high>low) {       //交换 否则 本while循环停止(查找停止)（理解：如果high<low说明整个数组已经找完了）
            int temp = list[high];
            list[high] = list[low];
            list[low] = temp;
        }
    }


    while (high>first && list[high]>=privot) //当右边high 没有动 并且有与基准元素相同的元素
        high--;

    if(privot>list[high]){
             list[first] =list[high];
             list[high]=privot;
             return high;
         }
         else {
             return  first;
         }
}

    public static void main(String[] args) {
        int[] arr={5,2,5,5,5,5};
        quicksort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
    }


}
