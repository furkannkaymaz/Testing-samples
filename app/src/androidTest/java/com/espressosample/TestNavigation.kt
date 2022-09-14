package com.espressosample

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.ExpectFailure.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

// using navigation test library

@RunWith(AndroidJUnit4::class)
class TestNavigation {

    @Test
    fun testNavigation() {

        val mockNavController = mock(NavController::class.java)

        launchFragmentInContainer<EmptyFragment>().onFragment {
            Navigation.setViewNavController(it.requireView(), mockNavController)
        }
        
        onView(ViewMatchers.withId(R.id.btnGoSecond)).perform(ViewActions.click())
        verify(mockNavController).navigate(EmptyFragmentDirections.actionEmptyFragmentToSecondFragment())

    }
}