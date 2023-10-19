package Streams;

public class PalindromeString {
    public void ps() {
        String text = "Kanak".toLowerCase();
        StringBuilder sb = new StringBuilder(text.toLowerCase());
        System.out.println(sb);
        String reverse = sb.reverse().toString();
        if(text.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("No");
        }


    }
}