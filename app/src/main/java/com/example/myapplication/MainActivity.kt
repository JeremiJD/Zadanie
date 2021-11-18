package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.wyswietlanie).setOnClickListener {
            findViewById<EditText>(R.id.Tekscik).setText("Jeremi \n Damski")
            findViewById<TextView>(R.id.innytekst).setText(R.string.tekscik)
        }
    }
}