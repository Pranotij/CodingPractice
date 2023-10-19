package Streams;

import java.util.List;

@FunctionalInterface
public interface WordCounter {
    List<String> countWords(String text);
}
