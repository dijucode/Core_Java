import java.util.Arrays;

public class DemoSortingArray {
    public static void main(String[] args) {
        int [] arr = {2,5,4,8,6,7,4,5};
        System.out.println("Array before sorting");

        for(int ele : arr){
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Array after Sorting");
        for(int ele : arr){
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("max ele = " + arr[arr.length -1]);
        System.out.println("min ele = " + arr[0]);
    }
}
