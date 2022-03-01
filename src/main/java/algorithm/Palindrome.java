package algorithm;

public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"Example", "Radar", "Salas", "Mitrais"};

        for (String word : words) {
            System.out.println(word + " is " + (isPalindrome(word) ? "" : "not ") + "a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        StringBuilder reverseWord = new StringBuilder();
        for (int index = word.length() - 1; index >= 0; index--) {
            reverseWord.append(word.charAt(index));
        }
        return reverseWord.toString().equalsIgnoreCase(word);
    }
}
