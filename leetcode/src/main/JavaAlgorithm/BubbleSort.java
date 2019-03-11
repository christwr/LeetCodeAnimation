package src.main.JavaAlgorithm;

/**
 * @Author: Wrui
 * @Date: 2019/3/8 13:44
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] result = bubbleSort(new int[]{3,1,2,6,4,5,7});
        System.out.println(result);
    }
    private static int[] bubbleSort(int[] a){
        int n = a.length;
        int i,j;
        //表示 n 次排序过程。
        for(i=0; i<n; i++){
            for(j=1; j<n-i; j++){
                //前面的数字大于后面的数字就交换
                if(a[j-1] > a[j]){
                    //交换 a[j-1]和 a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
