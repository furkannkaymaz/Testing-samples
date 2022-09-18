package com.espressosample.login

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LoginHelperTest{

    @Test
    fun emptyUsernameReturnFalse(){
        val result = LoginHelper.confirmLogin(
            "",
            "123",
            "123",
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameCorrectlyRepeatedPasswordReturnsTrue(){
        val result = LoginHelper.confirmLogin(
            "Furkan",
            "123456",
            "123456",
        )
        assertThat(result).isTrue()
    }

    @Test
    fun emptyPassWordReturnFalse(){
        val result = LoginHelper.confirmLogin(
            "Furkan",
            "",
            "",
        )
        assertThat(result).isFalse()
    }

    @Test
    fun passwordLetterUnderSixReturnFalse(){
        val result = LoginHelper.confirmLogin(
            "Furkan",
            "14",
            "15",
        )
        assertThat(result).isFalse()
    }
    @Test
    fun passwordAndRepassordDontMatchReturnFalse(){
        val result = LoginHelper.confirmLogin(
            "Furkan",
            "123456789",
            "12345678910",
        )
        assertThat(result).isFalse()
    }

}