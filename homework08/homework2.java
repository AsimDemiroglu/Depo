package homework08;

import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        //Size verilen Array'in tersini bir Array’e
        //kaydediniz.
        //int[] arr = {1800, 1550, 880, 560, 240, 450};

//        int[] arr={1800, 1550, 880, 560, 240, 450};
//        int [] arr2= new int[arr.length];
//        for (int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }
        int arr[]={1800, 1550, 880, 560, 240, 450};
        int yeniarr[]=new int[arr.length];
        int indexarr=arr.length-1;
        for (int w: arr){
            yeniarr[indexarr]=w;
            indexarr--;

        }
        System.out.println(Arrays.toString(yeniarr));
    }
}



