package com.sagheer.forms

class Password {
    fun isPasswordLength8(pass: String): Boolean {
        return pass.length >= 8
    }

    // this function tells that password has one Alphabet and Number
    fun isPasswordAlphaNumeric(pass: String): Boolean {
        return pass.contains(Regex("[a-z]"))
                && pass.contains(Regex("[0-9]"))
    }

    fun isPasswordHavingOneSmallOneCapitalOneNumber(pass: String): Boolean {
        return pass.contains(Regex("[a-z]"))
                && pass.contains(Regex("[0-9]"))
                && pass.contains(Regex("[A-Z]"))
    }

    fun isPhoneNumber(phone: String): Boolean {
        return !phone.trim().contains(Regex("[A-Za-z!~@%&_-]"))
    }

}