package CTCI.ArrayAndStrings;

public class IsUnique {

    /*
     * Implement algorithm to determine if a string has all unique characters. What if you cannot use additional data structures
     * */

    /*
    * Solution: I should ask if the string is an ASCII string or a Unicode string.
    * ASCII has only 128(256 if extended) different characters
    * Unicode has 65536 different characters its including japanese arabic
    * To simplicity the problem i assume its ASCII
    * */

    static boolean isUniqueChar(String str) {
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for( int i =0;i<str.length();i++) {
            int val = str.charAt(i);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }



    static boolean isUniqueCharBit(String str) {
        int checker = 0;
        for( int i =0; i<str.length();i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1<<val)) >0) {
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "asd|123%jthp";

        System.out.println(isUniqueChar(test));

        System.out.println(isUniqueCharBit(test));
    }

}
