package src.main.JavaAlgorithm;

/**
 * @Author: Wrui
 * @Date: 2019/3/8 17:47
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] result = insertSort(new int[]{1, 3, 2, 4, 6, 5, 7});
        System.out.println(result);
    }

    private static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //插入的数
            int insertVal = arr[i];
            //被插入的位置(准备和前一个数比较)
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                //将把 arr[index] 向后移动
                arr[index + 1] = arr[index];
                //让 index 向前移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index + 1] = insertVal;
        }
        return arr;
    }
}