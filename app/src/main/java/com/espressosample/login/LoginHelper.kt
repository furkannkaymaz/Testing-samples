package com.espressosample.login

object LoginHelper {

    fun confirmLogin(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        if (!(username.isEmpty() || password.isNotEmpty() || confirmPassword.isNotEmpty())){
            return true
        }
        if (password.count { it.isDigit()} < 6 || confirmPassword.count { it.isDigit()} < 6){
            return false
        }
        return true
    }
}