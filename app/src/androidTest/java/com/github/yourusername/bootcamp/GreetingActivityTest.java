package com.github.yourusername.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Activity;
import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void example_test() {

        Intent myIntent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        myIntent.putExtra("message", "Steve");
        //ApplicationProvider.getApplicationContext().startActivity(myIntent);
        ActivityScenario.launch(myIntent);

        onView(withId(R.id.greetingMessage)).check(matches(withText("Hello Steve")));
    }

}
