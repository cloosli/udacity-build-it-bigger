package com.udacity.gradle.jokes.test;

import com.udacity.gradle.jokes.Joker;

import org.junit.Test;

public class JokerTest {
    @Test
    public void test() {
        Joker joker = new Joker();
        assert joker.getJoke().length() != 0;
    }

    @Test
    public  void test2() {
        Joker joker = new Joker();
        for (int i = 0; i < 10; i++) {
            System.out.println(joker.getJoke());
        }
    }
}