package com.espressosample

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior.setTag
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito


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