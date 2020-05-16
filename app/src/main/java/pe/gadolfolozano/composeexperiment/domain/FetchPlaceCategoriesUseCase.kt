package pe.gadolfolozano.composeexperiment.domain

import pe.gadolfolozano.composeexperiment.data.PlaceRepository
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class FetchPlaceCategoriesUseCase {
    fun execute(): FlowState<List<PlaceCategory>> {
        val placeRepository = PlaceRepository()
        val placeCategories = placeRepository.fetchCategories()

        return FlowState.Success(placeCategories)
    }
}