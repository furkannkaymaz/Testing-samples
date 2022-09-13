package com.espressosample

import android.os.Build
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@HiltAndroidTest
@RunWith(RobolectricTestRunner::class)
@Config(
    manifest = Config.NONE,
    sdk = [Build.VERSION_CODES.O_MR1],
    application = HiltTestApplication::class
)
class EmptyFragmentTest {
    @get:Rule
    val hiltAndroidRule = HiltAndroidRule(this)

    @Before
    fun setup(){
        hiltAndroidRule.inject()
    }
    @Test
    fun testMainActivity() {
        launchFragmentInHiltContainer<EmptyFragment> {
            onView(withId(R.id.tvEmpty)).check(matches(withText("Hello")))
        }
    }
}