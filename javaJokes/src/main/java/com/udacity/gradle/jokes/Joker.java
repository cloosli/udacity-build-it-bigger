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
            "There are three kinds of lies: Lies, damned lies, and benchmarks.\n",
            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.\"",
            "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n" +
                    "\n" +
                    "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”",
            "A husband and a wife sit at the table, having dinner. The woman drops a bit of tomato sauce on her white top. \"Och, I look like a pig!\" \n" +
                    "\n" +
                    "The man nods, \"And you dropped tomato sauce on your top!\"",
            "What should you put on the tomb stone of a mathematician?\n" +
                    "-\n" +
                    "He didn't count with this...\n",
            "Q: Why did the shark keep swimming in circles?\n" +
                    "\n" +
                    "A: It had a nosebleed.\n",
            "Pessimist: \"Things just can't get any worse!\" \n" +
                    "\n" +
                    "Optimist: \"Nah, of course they can!\"",
            "I’ve no home, I haven’t got control, I can’t see any escape. Way past the time I got a new keyboard.\n",

    };

    public String getJoke() {
        return jokes[(int) (new Random().nextDouble() * jokes.length)];
    }
}