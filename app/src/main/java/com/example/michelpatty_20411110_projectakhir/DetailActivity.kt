@file:Suppress("DEPRECATION")

package com.example.michelpatty_20411110_projectakhir
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private var listlagu2 = mutableListOf <itemData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_detail)

        val detail = intent.getParcelableExtra<itemData>(MainActivity.INTENT_PARCELABLE)

            val imageView = findViewById<ImageView>(R.id._imgDetail)
            val textViewTitle = findViewById<TextView>(R.id._judulDetail)
            val textViewDesc = findViewById <TextView>(R.id._artisDetail)
            val favorit = findViewById<ImageView>(R.id._favoritDetail)

            imageView.setImageResource(detail!!.img)
            textViewTitle.text = detail.album
            textViewDesc.text = detail.artis

        val btn_back = findViewById<ImageView>(R.id.btn_back)

        btn_back.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}