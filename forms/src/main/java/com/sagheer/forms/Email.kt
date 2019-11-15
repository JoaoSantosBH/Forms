package com.sagheer.forms
import android.util.Patterns

class Email {

    fun isEmail(email: String): Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


}