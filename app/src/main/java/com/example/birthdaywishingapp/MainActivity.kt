package com.example.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etName:EditText=findViewById(R.id.etName)
        var tvName:TextView=findViewById(R.id.tvName)
        var button:Button=findViewById(R.id.button)
        button.setOnClickListener{
            var name=etName.text.toString()
            tvName.text="Many Many Happy Returns of the day, Happy Birthday!! "+name
        }


    }
}