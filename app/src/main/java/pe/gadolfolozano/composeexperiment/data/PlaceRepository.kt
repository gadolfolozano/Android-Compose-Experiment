package pe.gadolfolozano.composeexperiment.data

import pe.gadolfolozano.composeexperiment.data.util.RemoteUtil
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class PlaceRepository {
    suspend fun fetchPlaceCategories(): List<PlaceCategory> {
        val retrofit = RemoteUtil.provideRetrofit()
        val placeInterface = retrofit.create(PlaceInterface::class.java)

        val call = placeInterface.fetchPlaceCategories()

        val response = call.execute().body()

        return response?.categories?.map { PlaceCategory(100, "Cat 100") } ?: emptyList()
    }
}