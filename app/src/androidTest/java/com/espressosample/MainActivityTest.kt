package com.espressosample

import android.os.Build
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get:Rule
    val activityRule  : ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkLogin() {

        Thread.sleep(500)
        onView(withId(R.id.username)).perform(typeText("Furkan"))
        Thread.sleep(500)
        onView(withId(R.id.password)).perform(typeText("123456"))
        Thread.sleep(500)
        onView(withId(R.id.login)).perform(click())

        onView(withId(R.id.username)).check(matches(withText("Furkan")))
        Thread.sleep(500)
    }

    fun checkNavigation(){
      //  val navController = mock()

    }

}