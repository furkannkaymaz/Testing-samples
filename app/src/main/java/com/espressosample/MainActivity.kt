package com.espressosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.espressosample.databinding.ActivityMainBinding
import com.espressosample.login.LoginHelper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            rePassword.addTextChangedListener { checkButtonStatus() }
            password.addTextChangedListener { checkButtonStatus() }
            username.addTextChangedListener { checkButtonStatus() }
        }

    }

    private fun checkButtonStatus() {
        LoginHelper.checkBtnStatus(
            binding.username.text.toString(),
            binding.password.text.toString(),
            binding.rePassword.text.toString(),
            binding.login
        )
    }
}