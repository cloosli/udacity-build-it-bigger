package com.udacity.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;
    private String mJoke;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        mJoke = joke;
    }
}