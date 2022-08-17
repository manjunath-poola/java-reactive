package com.manju.reactive;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono()
                       .subscribe(e -> System.out.println(e));
        ReactiveSources.intNumberMono()
                       .subscribe(e -> System.out.println(e), error -> System.out.println(error));
        ReactiveSources.intNumberMono()
                       .subscribe(e -> System.out.println(e), error -> System.out.println(error),
        () -> System.out.println("Completed..."));

        // Get the value from the Mono into an integer variable
//        Integer value = ReactiveSources.intNumberMono()
//                                       .block();
        Optional<Integer> value = ReactiveSources.intNumberMono()
                                                 .blockOptional();
        System.out.println(value);
        System.out.println("Press a key to end");
        System.in.read();
    }

}