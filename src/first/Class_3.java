package first;

public class Class_3 {

    public static void main(String[] args) {
        String obj = "veyilA raglI";// Ilgar Aliyev
        System.out.println("String reverse: " + reverseStr(obj) );

        String obj1 = "AAAAZZZEER";//4A3Z2E1R
        System.out.println("Frequency of character = " + frequencyOfChar(obj1));
    }

    public static String reverseStr(String str){
        String nonDup = "";
        for (int i = str.length()-1; i >= 0; i--){
            nonDup += "" + str.toCharArray()[i];
        }
        return nonDup;
    }

    public static String frequencyOfChar(String str){
        String nonDup = "";
        for (int i = 0; i <= str.length()-1; i++){
            if (!nonDup.contains("" + str.charAt(i)) ){
                nonDup += "" + str.charAt(i);
            }
        }

        String expectedResult = "";
        for (int j = 0; j <= nonDup.length()-1; j++){
            int count = 0;
            for (int i = 0; i <= str.length()-1; i++){
                if (str.charAt(i) == nonDup.charAt(j) ){
                    count++;
                }
            }
            expectedResult += count + "" + nonDup.charAt(j);
        }

        return expectedResult;
    }
}
