package com.projectbox.footballtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by adinugroho
 */
@Parcelize
data class Club(
        val imageRes: Int,
        val title: String,
        val info: String
) : Parcelable