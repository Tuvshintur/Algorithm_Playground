package DataStructures;

public class Permutation {
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args) {
        String s = "abb";
        printPermutn(s, "");
    }
}
