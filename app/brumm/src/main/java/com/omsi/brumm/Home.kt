package com.omsi.brumm

import com.omsi.nonno.Tools


class Home {

    fun getResourceValue():String{
        var value = "My secret is now "+ Tools().giveMeYourSecret()
        return value
    }

    fun getResourceValueWithoutLib():String{
        var value = "My secret is "
        return value
    }
}