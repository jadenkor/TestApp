package com.testmodule.module1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ModuleActivity : AppCompatActivity() {

    companion object {

        fun buildIntent(context: Context): Intent {
            return Intent(context, ModuleActivity::class.java).apply {
//                putExtra("key", value)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)
    }
}