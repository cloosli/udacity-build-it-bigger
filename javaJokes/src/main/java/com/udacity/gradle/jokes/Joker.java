package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {

    final static String[] jokes = new String[]{
            "What is a programmer's favourite hangout place?\n" +
                    "A: Foo Bar",
            "Q: how many programmers does it take to change a light bulb?\n" +
                    "A: none, that's a hardware problem",
            "Why do programmers always mix up Halloween and Christmas? \n" +
                    "Because Oct 31 equals Dec 25.",
            "There are three kinds of lies: Lies, damned lies, and benchmarks.\n"
    };

    public String getJoke() {
        return jokes[(int) (new Random().nextDouble() * jokes.length)];
    }
}