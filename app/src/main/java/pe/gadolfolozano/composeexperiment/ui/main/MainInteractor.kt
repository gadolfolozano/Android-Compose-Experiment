package pe.gadolfolozano.composeexperiment.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.gadolfolozano.composeexperiment.domain.FetchPlaceCategoriesUseCase
import pe.gadolfolozano.composeexperiment.domain.FlowState
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class MainInteractor : ViewModel() {
    val placeCategoriesLiveData = MutableLiveData<List<PlaceCategory>>()

    fun fetchCategories() {
        viewModelScope.launch(Dispatchers.IO) {
            val fetchPlaceCategoriesUseCase = FetchPlaceCategoriesUseCase()
            val result = fetchPlaceCategoriesUseCase.execute()
            if (result is FlowState.Success) {
                placeCategoriesLiveData.postValue(result.data)
            }
        }
    }

}