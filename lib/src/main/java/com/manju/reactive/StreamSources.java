package com.manju.reactive;

import com.manju.reactive.model.User;

import java.util.stream.Stream;

public class StreamSources {
    public static Stream<Integer> integerNumberStream() {
        return Stream.iterate(0, i -> i + 2)
                     .limit(10);
    }

    public static Stream<String> stringNumberStream() {
        return Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
    }

    public static Stream<User> userStream() {
        return Stream.of(
                new User(1, "Manju", "Pula"),
                new User(2, "Mohan", "Perumalla"),
                new User(3, "Madhav", "Reddy"),
                new User(4, "Naga", "Raju"),
                new User(5, "Ram", "k"),
                new User(6, "Navin", "Pula")

        );
    }

}
