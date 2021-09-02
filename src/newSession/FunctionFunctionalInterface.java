package newSession;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {

        Function<String, String> reverse = s ->{
            String result = "";
            for (int i = s.length(); i>0; i--)
                result += s.charAt(i);
            return result;
        };

        String str1 = reverse.apply("Cybertek" );
        System.out.println(str1);

        System.out.println("-------------------------------------------");

        Function<int[], int[]> reverseIntArray = a ->{
            int[] result = new int[a.length];
            for (int i = 0, j = a.length-1; i < a.length; i++, j--){
                result[j] = a[i] ;
            }
            return result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = reverseIntArray.apply(arr1);
    }
}
