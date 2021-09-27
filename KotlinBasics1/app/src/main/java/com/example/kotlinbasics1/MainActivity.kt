package com.example.kotlinbasics1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvEnterName = findViewById<EditText>(R.id.tvEnterName)
        val tvEnterLocation = findViewById<EditText>(R.id.tvEnterLocation)
        val tvEnterMobile = findViewById<EditText>(R.id.tvEnterMobile)
        val leftBtn = findViewById<Button>(R.id.LeftBtn)
        val middleBtn = findViewById<Button>(R.id.middleBtn)
        val rightBtn = findViewById<Button>(R.id.RightBtn)
        val tvOne = findViewById<TextView>(R.id.tvOne)

        leftBtn.setOnClickListener {
            val name = tvEnterName.text.toString()
            val loc = tvEnterLocation.text.toString()
            val mob = tvEnterMobile.text.toString()
            val toast = Toast.makeText(applicationContext, "$name $loc $mob", Toast.LENGTH_LONG)
            toast.show()
        }

        middleBtn.setOnClickListener {
            val name = tvEnterName.text.toString()
            val loc = tvEnterLocation.text.toString()
            val mob = tvEnterMobile.text.toString()
            tvOne.text = "$name $loc $mob"
        }


        rightBtn.setOnClickListener {
            val name = tvEnterName.text.toString()
            val loc = tvEnterLocation.text.toString()
            val mob = tvEnterMobile.text.toString()
            val intent = Intent(this,A2::class.java)

            intent.putExtra("Name", name)
            intent.putExtra("Location", loc)
            intent.putExtra("Mobile", mob)

            startActivity(intent)
        }
    }

}