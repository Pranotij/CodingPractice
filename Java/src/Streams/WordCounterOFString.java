package Streams;


import java.util.Arrays;
import java.util.List;

public class WordCounterOFString {
    public void wordCount() {
        String text = "The quick brown fox jumps over the lazy dog.";

        //Will give the word count of the input string; in the interface change return type to int.

       // WordCounter wordCount  = s -> s.split("\\s+").length;
        //int count =  wordCount.countWords(text);
        //System.out.println("No. Of Words are "+count);

        //Will give all the unique string of the input : [., brown, dog, fox, jumps, lazy, over, quick, the]
        WordCounter wordCounter = s-> Arrays.stream(s.split("\\s+")).sorted().distinct().toList();
         List<String>li=  wordCounter.countWords(text.toLowerCase());
        System.out.println(li);





    }
}