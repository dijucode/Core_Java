public class ArrayMinElement {
    public static void main(String[] args) {
        int [] arr = {5,4,8,6,7,4,5};
        int min_ele = arr[0];
        for (int ele : arr){
            if(ele < min_ele){
                min_ele = ele;

            }

        }
        System.out.println(min_ele);
    }

}
