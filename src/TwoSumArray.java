public class TwoSumArray {
    public static void main(String[] args) {

        int [] arr = {3, 5, 1, 6, 2, 7, 9};
        for(int i=0; i<= arr.length; i++){
            for(int j= i+1; j <= arr.length; j++){
                if(i+j==8){
                    System.out.print(i + " ");
                    System.out.println(j);

                }
            }

        }

    }

}
