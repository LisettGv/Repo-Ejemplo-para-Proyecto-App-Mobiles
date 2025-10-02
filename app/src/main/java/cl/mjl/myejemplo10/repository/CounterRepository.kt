package cl.mjl.myejemplo10.repository
import cl.mjl.myejemplo10.model.Counter
// repository/CounterRepository.kt
class CounterRepository {
    private var counter = Counter()

    fun getCounter(): Counter = counter

    fun increment(): Counter {
        counter = counter.copy(value = counter.value + 1)
        return counter
    }

    fun decrement(): Counter {
        counter = counter.copy(value = counter.value - 1)
        return counter
    }
}