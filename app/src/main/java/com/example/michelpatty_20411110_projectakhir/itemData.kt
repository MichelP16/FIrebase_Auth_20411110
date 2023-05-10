package com.example.michelpatty_20411110_projectakhir

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class itemData (
    val img : Int,
    val favorit : Int,
    val album : String,
    val artis : String,
    ) : Parcelable