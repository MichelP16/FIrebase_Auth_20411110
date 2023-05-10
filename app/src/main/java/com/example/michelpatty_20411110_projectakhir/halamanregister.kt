package com.example.michelpatty_20411110_projectakhir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halamanregister : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_register)

        val btn_register = findViewById<Button>(R.id.btn_register)

        btn_register.setOnClickListener {
            Intent(this, halamanlogin::class.java).also {
                startActivity(it)
            }
        }

        val btn_haveaccount = findViewById<Button>(R.id.btn_haveaccount)

        btn_haveaccount.setOnClickListener {
            Intent(this, halamanlogin::class.java).also {
                startActivity(it)
            }
        }
    }
}