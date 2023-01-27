package com.example.testapp.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.testapp.databinding.TestViewBinding

class TestView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val binding = TestViewBinding.inflate(LayoutInflater.from(context), this)


}