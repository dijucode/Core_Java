public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {15,3,45,23,12, 22};
        for(int ele : arr){
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();
        int mid = (arr.length)/2;
        int i = 0;
        while(i <= mid){
            int temp = arr[i];
            arr[i] = arr[arr.length -1-i];
            arr[arr.length -1-i] = temp;
            i++;

        }
        for(int ele : arr){
            System.out.print(ele);
            System.out.print(" ");
        }
    }
}
