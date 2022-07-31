//堆排序
//1.用数组构建（模拟）一个堆（是一个完全二叉树 而且每个节点大于或等于他的任何一个子节点）
//2.砍树
import java.util.LinkedList;

public class HeapSort {


    public static void main(String[] args) {
        int[] arr={10,92,31,45,51,17,19};
        HeapSort(arr);
        for (int i:arr){
            System.out.println(i);
        }

    }

    public  static  void HeapSort(int[] arr){

        Heap<Integer> heap=new Heap<>();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for (int i = arr.length-1;
             i >=0 ; i--) {
            arr[i]=heap.remove();

        }


    }
    static class Heap<E extends Comparable<E>>{
        private  LinkedList<E> list=new LinkedList<>();
        public Heap(){}
        public Heap(E[] objects ){
            for (int i = 0; i < objects.length; i++) {
                add(objects[i]);
            }
        }

        public void add(E newObject){
            //最后一个节点为 当前节点
            //向上重构堆


            list.add(newObject);
            int currentIndex=list.size()-1;//最后一个索引
            while (currentIndex>0){
                int parentIndex=(currentIndex-1)/2;
                if (list.get(currentIndex).compareTo(list.get(parentIndex))>0){//与父节点比较
                    E temp=list.get(currentIndex);                
                    list.set(currentIndex,list.get(parentIndex));
                    list.set(parentIndex,temp);
                }
                else {
                    break;
                }
                currentIndex=parentIndex;
            }
        }

        public E remove() {
            //1.最后一个节点覆盖根节点
            //2.当前节点为根节点
            //3.从当前节点 重构整个堆


            if (list.size() == 0) return null;
            E removedObject = list.get(0); //取出第一个（根节点）
            list.set(0, list.get(list.size() - 1));//把最后一个节点 放在索引为0 位置

            int currentIndex = 0;
            while (currentIndex < list.size()) {

              int leftChildIndex=2*currentIndex+1;
              int rightChildIndex=2*currentIndex+2;

              if (leftChildIndex>=list.size())
                  break;         // 不可超越数组大小 (叶子节点则跳出循环)

              int maxIndex=leftChildIndex; //默认假设左节点为最大

              if (rightChildIndex<list.size()){  // 若右节点合理存在
                  if (list.get(maxIndex).compareTo(list.get(rightChildIndex))<0){  //左右子节点比较
                      maxIndex=rightChildIndex;
                  }
              }

              if (list.get(currentIndex).compareTo(list.get(maxIndex))<0){
                  E temp=list.get(maxIndex);
                  list.set(maxIndex,list.get(currentIndex));
                  list.set(currentIndex,temp);
                  currentIndex=maxIndex;
              }
              else {
                  break;
              }
            }
            return  removedObject;
        }
        public int getSize(){
            return list.size();
        }
}
}
