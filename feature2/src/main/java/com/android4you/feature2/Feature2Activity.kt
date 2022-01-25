package com.android4you.feature2

import android.os.Bundle
import com.android4you.common.BaseActivity
import com.android4you.common.contractArgs
import com.android4you.feature2.databinding.ActivityFeature2Binding
import com.android4you.navigation.contracts.Feature2Contract
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Feature2Activity : BaseActivity() {
    private val args by contractArgs { contracts.feature2Contract }
    private lateinit var binding: ActivityFeature2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = args.argument1
        binding.button.setOnClickListener {
            setContractResult(contracts.feature2Contract, Feature2Contract.Result("result"))
            finish()
        }
    }
}
