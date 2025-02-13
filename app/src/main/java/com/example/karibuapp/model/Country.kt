package com.example.karibuapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Country(
    @DrawableRes val countryImage: Int,
    @StringRes val countryName: Int,
    @StringRes val countryCapital: Int,
    @StringRes val countryCode: Int
)