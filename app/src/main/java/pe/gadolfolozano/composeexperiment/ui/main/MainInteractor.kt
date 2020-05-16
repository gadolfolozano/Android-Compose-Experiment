package pe.gadolfolozano.composeexperiment.ui.main

import pe.gadolfolozano.composeexperiment.domain.FetchPlaceCategoriesUseCase
import pe.gadolfolozano.composeexperiment.domain.FlowState

class MainInteractor(val activity: MainActivity) {

    fun fetchCategories(){
        val fetchPlaceCategoriesUseCase = FetchPlaceCategoriesUseCase()
        val result = fetchPlaceCategoriesUseCase.execute()
        if(result is FlowState.Success){
            activity.updatePlaceCategories(result.data)
        }
    }


}