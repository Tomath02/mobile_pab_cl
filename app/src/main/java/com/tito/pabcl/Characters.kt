package com.tito.pabcl

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Characters(
    var name : String = "",
    var vision : String = "",
    var weapon : String = "",
    var detail : String = "",
    var photo : Int = 0
) : Parcelable
