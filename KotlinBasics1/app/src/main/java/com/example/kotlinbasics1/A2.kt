package com.example.kotlinbasics1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class A2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tv)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val loc = intent.getStringExtra("Location")
        val mob = intent.getStringExtra("Mobile")


        val resTV = findViewById<TextView>(R.id.tvTwo)

        resTV.text = "$name $loc $mob "
    }}