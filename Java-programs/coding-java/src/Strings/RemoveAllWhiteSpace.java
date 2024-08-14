package Strings;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        /**
         * 
         * Remove all white spaces from a String 
         */

        String str = "   bishnu   das   ";
        System.out.println(str.replaceAll("\\s", "")); //bishnudas

        String str2 = "   bishnu   das   ";
        String result = "";
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(!Character.isWhitespace(ch)){
                result += ch;
            }
        }

        System.out.println(result); //bishnudas


    }
}
