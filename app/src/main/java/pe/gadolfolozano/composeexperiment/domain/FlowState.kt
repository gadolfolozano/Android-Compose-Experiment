package pe.gadolfolozano.composeexperiment.domain

import androidx.annotation.StringRes

sealed class FlowState<out T> {
    data class Success<T>(val data: T) : FlowState<T>()
    data class Failure(val throwable: Throwable) : FlowState<Nothing>()
}