package pe.gadolfolozano.composeexperiment.data

import pe.gadolfolozano.composeexperiment.data.entity.FetchPlaceCategoriesResponseEntity
import retrofit2.Call
import retrofit2.http.GET

interface PlaceInterface {
    @GET("categories")
    fun fetchPlaceCategories(): Call<FetchPlaceCategoriesResponseEntity>
}