package com.codehunta.funfact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehunta.funfact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter: FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact() {
        adapter = FactAdapter(this, DummyData.funFacts)
        //binding?.listViewFacts?.adapter = adapter
        binding?.listViewMain?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}