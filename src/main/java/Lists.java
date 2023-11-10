import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lists {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10;i++){
            arr[i] = i;
        }


        long start2 = System.currentTimeMillis();
        System.out.println(findSum(arr,arr.length));


//        ArrayList<Integer> integers = new ArrayList<>();
//        IntStream.range(0,10).forEach(integers::add);
//        integers.add(3);
//        integers.forEach(System.out::println);
        System.out.println((System.currentTimeMillis() - start2) + " ms2");
        long start = System.currentTimeMillis();
        System.out.println(sum(arr));
        System.out.println((System.currentTimeMillis() - start) + " ms1");
    }

       static int sum(int[] arr){
        int summa= 0;
        if (arr.length == 0){
          return arr[0];
        }
        for (int i = 0; i < arr.length;i++){
            summa += arr[i];
        }
        return summa;
    }
    static int findSum(int[] arr, int n){
            if (arr.length == 0){
                return arr[0];
            }
            return Arrays.stream(arr).sum()   ;

    }


}
