package pe.gadolfolozano.composeexperiment.domain

import pe.gadolfolozano.composeexperiment.data.PlaceRepository
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class FetchPlaceCategoriesUseCase {
    suspend fun execute(): FlowState<List<PlaceCategory>> {
        val placeRepository = PlaceRepository()
        val placeCategories = placeRepository.fetchPlaceCategories()

        return FlowState.Success(placeCategories)
    }
}