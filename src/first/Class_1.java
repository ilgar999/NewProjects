package first;

public class Class_1 {

    public static void main(String[] args) {

        String str = "Ilgar Ali";
        String nonObj = "";
        for (int i = str.length()-1; i>=0; i--){
            nonObj += str.toCharArray()[i];
        }
        System.out.println(nonObj);


    }



}
