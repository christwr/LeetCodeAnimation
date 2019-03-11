package src.main.JavaAlgorithm;

/**
 * @Author: Wrui
 * @Date: 2019/3/8 11:59
 */
public class BiSearch {
    public static void main(String[] args) {
        int result = biSearch(new int[]{1,2,3,4,5,6},3);
        System.out.println(result);
    }
    private static int biSearch(int[] array, int a){
        int lo = 0;
        int high = array.length;
        while (lo<=high){
            int mid = (lo+high)/2;
            if (array[mid] == a){
                return mid;
            }else if (a>array[mid]){
                lo = mid+1;
            }else {
                high  = mid-1;
            }
        }
        return -1;
    }
}
