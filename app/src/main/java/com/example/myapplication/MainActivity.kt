package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //In der Activity "by viewModels()" statt "by activityViewModels()"
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.counterTV.text = viewModel.counter.toString()


        binding.addBTN.setOnClickListener {

            //Event "onClick" wird ans ViewModel "weitergegeben"
            viewModel.increaseCounter()

            //Daten(counter) werden aus dem ViewModel ausgelesen
            binding.counterTV.text = viewModel.counter.toString()

        }
    }
}