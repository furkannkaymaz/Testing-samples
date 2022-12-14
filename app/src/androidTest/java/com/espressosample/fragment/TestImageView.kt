package com.espressosample.fragment

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.espressosample.R
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class TestImageView {

    @Test
    fun testImageView() {

        launchFragmentInContainer<SecondFragment>().onFragment {

        }
        onView(withId(R.id.ivAndroid)).check(matches(isDisplayed()))
        onView(withId(R.id.ivAndroid)).check(matches(withId(R.id.ivAndroid)))

    }

}