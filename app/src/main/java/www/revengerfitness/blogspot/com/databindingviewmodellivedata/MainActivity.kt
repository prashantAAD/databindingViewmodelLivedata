package www.revengerfitness.blogspot.com.databindingviewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import www.revengerfitness.blogspot.com.databindingviewmodellivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
//mainViewModel.quoteLiveData.observe(this) {
        //  binding.tv.text = it
//}

        //  binding.btn.setOnClickListener {
        //    mainViewModel.updateQuote()
        // }
        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this

    }
}