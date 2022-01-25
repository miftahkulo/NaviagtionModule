package com.android4you.feature1

import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import com.android4you.common.BaseActivity
import com.android4you.feature1.databinding.ActivityFeature1Binding
import com.android4you.navigation.contracts.Feature2Contract
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Feature1Activity : BaseActivity() {
    private lateinit var feature2ContractLauncher: ActivityResultLauncher<Feature2Contract.Args>
    private lateinit var binding: ActivityFeature1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        feature2ContractLauncher = registerForActivityResult(contracts.feature2Contract) {
            if (it != null) {
                Log.e("Result -- >", it.result1)
            }
        }

        binding.button.setOnClickListener {
            feature2ContractLauncher.launch(Feature2Contract.Args("Manu"))
        }

        binding.button2.setOnClickListener {
            contracts.feature3Contract.launch()
        }

        binding.button3.setOnClickListener {
        }
    }
}
