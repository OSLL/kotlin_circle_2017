package com.example.user.tests


import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches

import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText


@RunWith(AndroidJUnit4::class)
class MainActivityEspressoTest {

    @Rule @JvmField
    var mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun ensureTextChangesWork() {
        // Type text and then press the button.
        onView(withId(R.id.inputField))
                .perform(typeText("HELLO"), closeSoftKeyboard())
        onView(withId(R.id.changeText)).perform(click())

        // Check that the text was changed.
        onView(withId(R.id.inputField)).check(matches(withText("Test text")))
    }

    @Test
    fun changeText_newActivity() {
        // Type text and then press the button.
        onView(withId(R.id.inputField)).perform(typeText("NewText"),
                closeSoftKeyboard())
        onView(withId(R.id.switchActivity)).perform(click())

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.resultView)).check(matches(withText("NewText")))
    }
}