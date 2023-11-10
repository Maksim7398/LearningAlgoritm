import java.util.IllegalFormatCodePointException;

public class ReCUR {
    public static void main(String[] args) {
        System.out.println(factrl(5));

    }

    static int recurs(int start) {

        if (start <= 0) {

            return start;
        }
        System.out.println(start);
        return recurs(start - 1);
    }
    static int factrl(int n){
        int f = 1;
        if (n==1){
            return f;
        }
        f = n * factrl(n-1);
        return f;
    }

}


