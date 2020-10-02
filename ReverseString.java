package edu.neu.info5100;

public class ReverseString {
    public String reverse(String s) {
        String[] wordWithSpaces = s.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (int i = wordWithSpaces.length - 1; i >= 0; i--) {
            if (!wordWithSpaces[i].strip().isEmpty()) {
                reverseString.append(wordWithSpaces[i].toLowerCase()).append(" ");
            }
        }
        return reverseString.toString().strip();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String test1 = "The sky is blue";
        System.out.println(reverseString.reverse(test1));
    }

}
