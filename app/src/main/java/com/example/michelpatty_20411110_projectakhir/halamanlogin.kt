package com.example.michelpatty_20411110_projectakhir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halamanlogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_login)

        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val btn_register = findViewById<Button>(R.id.btn_register)

        btn_register.setOnClickListener {
            Intent(this, halamanregister::class.java).also {
                startActivity(it)
            }
        }

        val btn_home = findViewById<Button>(R.id.btn_home)

        btn_home.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}