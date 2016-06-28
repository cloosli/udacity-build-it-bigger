package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {

    String[] jokes = new String[]{
            "What is a programmer's favourite hangout place?\n" +
                    "A: Foo Bar",
            "Q: how many programmers does it take to change a light bulb?\n" +
                    "A: none, that's a hardware problem"
    };

    public String getJoke() {
        return jokes[new Random().nextInt(jokes.length - 1)];
    }
}