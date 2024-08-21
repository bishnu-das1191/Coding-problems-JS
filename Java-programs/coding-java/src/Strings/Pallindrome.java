package Strings;

public class Pallindrome {
    public static void main(String[] args) {
        /**
         * Check if the given String is Pallindrom or not
         */

        String str = "madam";

        int i=0; 
        int j = str.length()-1;
        boolean flag = true;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag){
            System.out.println("Its a Pallindrome");
        }else
            System.out.println("Its NOT a Pallindrome");

    }
}
