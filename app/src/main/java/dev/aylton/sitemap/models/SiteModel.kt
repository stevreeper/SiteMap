package dev.aylton.sitemap.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SiteModel(
    var id: String = "",
    var name: String = "",
    var description: String = "",
    var image: String = "",
    var isVisited: Boolean = false,
    var location: Location = Location()
) : Parcelable

@Parcelize
data class Location(
    var lat: Double = 0.0,
    var lng: Double = 0.0,
    var zoom: Float = 0.0f
) : Parcelable
