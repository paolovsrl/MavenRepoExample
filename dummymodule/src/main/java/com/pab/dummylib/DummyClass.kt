package com.pab.dummylib

import com.omsi.nonno.Tools

class DummyClass {
    fun getResourceValue():String{
        val value = "My secret is  "+ Tools().giveMeYourSecret()
        return value
    }

    fun getResourceValueWithoutLib(): String {
        return "Ciao Mamma!"
    }
}