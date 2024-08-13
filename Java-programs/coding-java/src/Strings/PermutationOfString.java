package Strings;

public class PermutationOfString {
    public static void main(String[] args) {
        /**
         * Print all the permutations of a given string
         * 
        */

        String str = "bishnu";

        printAllPermutaion(str,"");
    }

    private static void printAllPermutaion(String inputStr, String result) {
        
        if(inputStr.length() == 0){
            System.out.println(result);
        }else{
            for (int i = 0; i < inputStr.length(); i++) {
                String rem = inputStr.substring(0,i) + inputStr.substring(i+1);
                printAllPermutaion(rem, result + inputStr.charAt(i));
            }
            
        }
        

    }


}
