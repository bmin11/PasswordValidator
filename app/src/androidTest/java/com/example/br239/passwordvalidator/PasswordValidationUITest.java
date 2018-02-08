package com.example.br239.passwordvalidator;

/**
 * Created by br239 on 2018-02-08.
 */

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
public class PasswordValidationUITest {

    private String bestInput, mediocreInput, badInput;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void inittrings() {
        // Specify a valid string.
        bestInput = "tHisI$$oMe#weird#butValid@password";
        mediocreInput = "thiskindaworks1234";
        badInput = "password";
    }

    @Test
    public void checkInputPassesEverything() {
        onView(withId(R.id.tbPassword))
                .perform(typeText(bestInput), closeSoftKeyboard());
        onView(withId(R.id.tvMessage))
                .check(matches(withText("6 out of 6")));

        onView(withId(R.id.tbPassword))
                .perform(clearText());
        onView(withId(R.id.tbPassword))
                .perform(typeText(mediocreInput), closeSoftKeyboard());
        onView(withId(R.id.tvMessage))
                .check(matches(withText("4 out of 6")));

        onView(withId(R.id.tbPassword))
                .perform(clearText());
        onView(withId(R.id.tbPassword))
                .perform(typeText(badInput), closeSoftKeyboard());
        onView(withId(R.id.tvMessage))
                .check(matches(withText("3 out of 6")));
    }


}
