package www.revengerfitness.blogspot.com.databindingviewmodellivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    val quoteLiveData = MutableLiveData("what u give is what u get")

    fun updateQuote(){
        quoteLiveData.value="u will see it when you believe it"
    }
}