package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnsignup.setOnClickListener{
            val firstName=etfirstname.text.toString()
            var lastName=etlastname.text.toString()
            var phoneNumber=etphonenumber.text.toString()
            var password=etpassword.text.toString()
            var passwordConfirmation=etconfirmpassword.text.toString()
        }
    }
}

