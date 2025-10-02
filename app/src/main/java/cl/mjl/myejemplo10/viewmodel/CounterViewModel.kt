package cl.mjl.myejemplo10.viewmodel
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import cl.mjl.myejemplo10.repository.CounterRepository

class CounterViewModel : ViewModel() {
    private val repository = CounterRepository()
    var counter by mutableStateOf(repository.getCounter())
        private set

    fun increment() {
        counter = repository.increment()
    }

    fun decrement() {
        counter = repository.decrement()
    }
}