package pe.gadolfolozano.composeexperiment.data

import retrofit2.http.GET

interface PlaceInterface {
    @GET("categories")
    suspend fun fetchCategories()
}