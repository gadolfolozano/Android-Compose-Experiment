package pe.gadolfolozano.composeexperiment.data.entity

import com.google.gson.annotations.SerializedName

data class FetchPlaceCategoriesResponseEntity(
    @SerializedName("categories") val categories: List<PlaceCategoriesEntity>
)

data class PlaceCategoriesEntity(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)