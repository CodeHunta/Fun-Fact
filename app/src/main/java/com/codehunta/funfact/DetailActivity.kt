package com.codehunta.funfact

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.codehunta.funfact.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setUpDetail()
    }

    private fun setUpDetail() {
        //binding?.txtViewDetails?.text = detail
        binding?.txtViewFact?.text = detail
        binding?.imgViewLogo?.setImageResource(logo)
        title = name

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}