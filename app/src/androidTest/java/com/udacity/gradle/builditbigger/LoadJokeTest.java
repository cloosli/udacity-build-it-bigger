package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by ChristianL on 04.07.16.
 */
public class LoadJokeTest extends AndroidTestCase {

    public void testSomething() {
        assertTrue(true);
    }

    public void testJoke() {
        EndpointsAsyncTask task = new EndpointsAsyncTask(new EndpointsAsyncTask.Listener() {
            @Override
            public void onJokeLoaded(String joke) {

            }

            @Override
            public void onJokeError(Exception e) {

            }
        });
        task.execute();

        try {
            String joke = task.get(30, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
            assertFalse(joke.startsWith("404"));
            System.out.println(joke);

        } catch (InterruptedException e) {
            fail(e.getMessage());
        } catch (ExecutionException e) {
            fail(e.getMessage());
        } catch (TimeoutException e) {
            fail(e.getMessage());
        }
    }
}
