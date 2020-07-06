package practicestream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson14Stream {
    public static void main(String[] args) {
        List<String> listForStreams = Arrays.asList("aaaaaaaaaaaaaaaaaaaa", "a2", "a2", "a3");

        Stream<String> stream = listForStreams.stream();

        stream
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .peek(s -> {
                    System.out.println(s.toUpperCase());
                    System.out.println(s.toLowerCase());
                })
                .distinct()
                .collect(Collectors.toList());

    }//end of main
}//end of class
