package com.espressosample.login

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

object LoginHelper {

    fun confirmLogin(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        } else if (password != confirmPassword) {
            return false
        } else if (password.length < 6 && confirmPassword.length < 6) {
            return false
        }
        return true
    }

    fun checkBtnStatus(
        viewUsername: String,
        viewPassword: String,
        viewRepassword: String,
        viewButton: Button
    ) {

        if (confirmLogin(
                viewUsername,
                viewPassword,
                viewRepassword
            )
        ) {
            viewButton.visibility = View.VISIBLE
        } else {
            viewButton.visibility = View.GONE
        }
    }
}