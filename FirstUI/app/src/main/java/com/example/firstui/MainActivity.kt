package com.example.firstui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener(){
            randRoll()
        }

        val buttonCount: Button = findViewById(R.id.button_countup)
        buttonCount.setOnClickListener(){
            countUp()
        }
    }

    private fun randRoll(){
        val randomInt = (1..6).random()
        val textMsg: TextView = findViewById(R.id.text_roll)
        textMsg.text = randomInt.toString()
        Toast.makeText(this,R.string.msg,Toast.LENGTH_LONG).show()
    }

    private fun countUp(){
        val textMsg: TextView = findViewById(R.id.text_roll)
        var num = (textMsg.text).toString()
        var result = num.toInt()
        if(result < 6) {
            textMsg.text = (result+1).toString()
        }
    }
}




