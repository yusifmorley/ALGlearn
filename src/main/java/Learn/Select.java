package Learn;
//选择排序
//算法步骤
//1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
//2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
//3.重复第二步，直到所有元素均排序完毕。
//时间复杂度 n^2  不稳定
public class Select {
    public static void main(String[] args) {
    int[] arr ={4,8,9,5,6,4,2,7,5,6}; //由小到大
//每次循环后 将最大的 放在最前面
//主要是 "选"
        // 也是像插入排序一样 把数组分为两段 一段时有序 另一段是待排 一次循环后 待排序列最大数 被放在 待排序列开头
        int max =0;//
        int temp;
        for (int i = 0; i < arr.length; i++) {
            max=i;// 最大元素默认为每次循环的第一个元素
            for (int j = i; j < arr.length; j++) {  //从 i到最后
                if (arr[j]>arr[max]){  //选
                    max=j;       //如果比 max大 就赋值给max
                }
            }
            //交换最大元素
            temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
