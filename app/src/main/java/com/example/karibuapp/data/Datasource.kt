package com.example.karibuapp.data

import com.example.karibuapp.R
import com.example.karibuapp.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf<Country>(
            Country(
                R.drawable.allemagne,
                R.string.pays1,
                R.string.capital1,
                R.string.code1
            ),
            Country(
                R.drawable.cameroun,
                R.string.pays2,
                R.string.capital2,
                R.string.code2
            ),
            Country(
                R.drawable.espagne,
                R.string.pays3,
                R.string.capital3,
                R.string.code3
            ),
            Country(
                R.drawable.italie,
                R.string.pays4,
                R.string.capital4,
                R.string.code4
            ),
            Country(
                R.drawable.maroc,
                R.string.pays5,
                R.string.capital5,
                R.string.code5
            ),
            Country(
                R.drawable.nigeria,
                R.string.pays6,
                R.string.capital6,
                R.string.code6
            ),
            Country(
                R.drawable.rdc,
                R.string.pays7,
                R.string.capital7,
                R.string.code7
            ),
            Country(
                R.drawable.senegal,
                R.string.pays8,
                R.string.capital8,
                R.string.code8
            ),
            Country(
                R.drawable.togo,
                R.string.pays9,
                R.string.capital9,
                R.string.code9
            ),
            Country(
                R.drawable.tunisie,
                R.string.pays10,
                R.string.capital10,
                R.string.code10
            ),
            Country(
                R.drawable.france,
                R.string.pays11,
                R.string.capital11,
                R.string.code11
            ),
            Country(
                R.drawable.kenya,
                R.string.pays12,
                R.string.capital12,
                R.string.code12
            ),
        )
    }
}