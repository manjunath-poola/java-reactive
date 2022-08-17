package com.manju.reactive;

import com.manju.reactive.model.User;

import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        // print all the numbers from int stream
        StreamSources.integerNumberStream()
                     .forEach(System.out::println);
        // print all the numbers from int stream that are less than 5
        StreamSources.integerNumberStream()
                     .filter(num -> num < 5)
                     .forEach(System.out::println);
        // print all the numbers from int stream that are greater than 5
        StreamSources.integerNumberStream()
                     .filter(num -> num > 5)
                     .forEach(System.out::println);
        // print all the numbers from int stream that are greater than 5, print first number
        System.out.println(StreamSources.integerNumberStream()
                                        .filter(num -> num > 5)
                                        .findFirst()
                                        .orElse(-1));
        // print first name if id present in int stream
        StreamSources.integerNumberStream()
                     .flatMap(id -> StreamSources.userStream()
                                                 .filter(user -> user.getId() == id))
                     .map(User::getFirstName)
                     .forEach(System.out::println);

    }
}
