package pe.gadolfolozano.composeexperiment.data

import pe.gadolfolozano.composeexperiment.data.util.RemoteUtil
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class PlaceRepository {
    fun fetchCategories(): List<PlaceCategory> {
        val retrofit = RemoteUtil.provideRetrofit()
        val placeInterface = retrofit.create(PlaceInterface::class.java)

        //placeInterface.fetchCategories()

        return listOf(
            PlaceCategory(100, "Cat 100"),
            PlaceCategory(101, "Cat 101"),
            PlaceCategory(102, "Cat 102")
        )
    }
}