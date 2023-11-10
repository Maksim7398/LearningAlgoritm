import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {

        int [] el = new int[100000];
        int number = 3;

//        for (int i = 0; i < 10; i++){
//            el[i] = i;
//        }
        IntStream.range(0,100000).forEach(index -> el[index] = new Random().nextInt(100000));

        long start = System.currentTimeMillis();
        sort(el);
        System.out.println((System.currentTimeMillis() - start) + " ms1");
//        long start1 = System.currentTimeMillis();
//        Arrays.sort(el);
//        System.out.println((System.currentTimeMillis() - start1) + " ms2");
//        System.out.println((System.currentTimeMillis() - start) + " ms");


    }

    static void sort(int[] array){
        for (int i = 0; i < array.length;i++){

            int minCount = i;
            for (int j = i + 1;j < array.length;j++) {
                if (array[j] < array[minCount]) {
                   minCount = j;
                }
            }
            int c = array[i];
            array[i] = array[minCount];
            array[minCount] = c;

        }

    }
    static int[] inputToEnd(int [] array, int el){
        int size = array.length + 1;
        int[] newArray = new int[size];
        for (int i = 0; i < array.length;i++){
            newArray[i] = array[i];
        }
        newArray[size-1] = el;
        return newArray;
    }

    static int simpleSearch(int[] el,int number){
        long start = System.currentTimeMillis();
        int index = -1;
        int count = 0;
        for (int i = 0;i < el.length;i++){
            if (el[i] == number){
                index = i;

            }
            count++;
        }
        System.out.println("кол-во проверок: " + count);
        System.out.println((System.currentTimeMillis() - start)  + " мс" + " simple");
        return index;
    }
   static int binarySearch(int[] el,int number){
       long start = System.currentTimeMillis();
        int left = 0;
        int right = el[el.length -1];
        int index = -1;

        int count = 1;
        while (left<= right){
            int middle = (left + right) /2;
            if (el[middle] < number){
                left= middle + 1;
            }
            else if(el[middle] > number){
                right = middle -1;
            }
            else if(el[middle] == number){
               index = middle;
               break;
            }
            count++;
        }
       System.out.println("кол-во проверок: " + count);
       System.out.println((System.currentTimeMillis() - start)  + " мс" + " binary");
        return index;


    }
}
