package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text : TextView = findViewById(R.id.texto);

        val btnAdd : Button = findViewById(R.id.btnAdd)
        val btnGrow : Button = findViewById(R.id.btnGrow)
        val btnHide : Button = findViewById(R.id.btnHide)
        val btnReset : Button = findViewById(R.id.btnReset)
        val btnShrink : Button = findViewById(R.id.btnShrink)
        val btnTake : Button = findViewById(R.id.btnTake)

        btnAdd.setOnClickListener(this)
        btnGrow.setOnClickListener(this)
        btnHide.setOnClickListener(this)
        btnReset.setOnClickListener(this)
        btnShrink.setOnClickListener(this)
        btnTake.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnAdd-> Log.i("MSG","ADD")
            }
        }
    }
}

