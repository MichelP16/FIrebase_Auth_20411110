package com.example.michelpatty_20411110_projectakhir

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private var listlagu = mutableListOf <itemData>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logout = findViewById<ImageButton>(R.id.btn_logout)
        logout.setOnClickListener {
            logout()
        }

//Lagu R&B
        val RecyclerView = findViewById<RecyclerView>(R.id.lagurnbRV)

        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.theweeknd, "After Hours", "The Weeknd",R.drawable.theweeknd2, "Is There Someone Else","The Weeknd", R.drawable.theweeknd3, "Blinding Light", "The Weekend", R.drawable.theweeknd, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.drake, "Scorpion", "Drake",R.drawable.drake2, "God's Plan","Drake", R.drawable.drake3, "Hotline Bling", "Drake", R.drawable.drake, "Laugh Now Cry Later", "Drake ft. Lil Durk"))
        listlagu.add(itemData(R.drawable.postmalone, "Stoney", "Post Malone",R.drawable.postmalone2, "Circles","Post Malone", R.drawable.postmalone3, "GoodByes", "Post Malone ft. Youngthug", R.drawable.postmalone, "Sunflower", "Post Malone, Swaelee"))
        listlagu.add(itemData(R.drawable.akon, "Trouble", "Akon",R.drawable.akon2, "Be With You","Akon", R.drawable.akon3, "Lonely", "Akon", R.drawable.akon, "Let It Go", "Akon & Wiz Khalifa"))
        listlagu.add(itemData(R.drawable.brunomars,"24K Magic", "Bruno Mars",R.drawable.brunomars2, "Too Good To Say Goodbye","Bruno Mars", R.drawable.brunomars3, "Versace On The Floor", "Bruno Mars", R.drawable.brunomars, "When I Was Your Man", "Bruno Mars"))

        RecyclerView.setHasFixedSize(true)
        RecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

//Lagu Indo Pop
        val RecyclerView1 = findViewById<RecyclerView>(R.id.laguindopopRV)
        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.lyodra, "Lyodra", "Lyodra",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.tiaraandini, "Tiara Andini", "Tiara Andini",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.mahalini, "Fabula", "Mahalini",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.ziva, "Magnoliya", "Ziva",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.glenn,"Kembali", "Glenn Fredly",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))

        RecyclerView1.setHasFixedSize(true)
        RecyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView1.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

//Lagu EDM
        val RecyclerView2 = findViewById<RecyclerView>(R.id.laguedmRV)
        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.diplo, "Revolution", "Diplo",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.djsnake,"Encore", "Dj Snake",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.skrillex, "Recess", "Skrillex",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.martingarrix, "Martin Garrix", "Martin Garrix",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.yellowclaw, "New Blood", "Yellow Claw",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))

        RecyclerView2.setHasFixedSize(true)
        RecyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView2.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

//Lagu RAP
        val RecyclerView3 = findViewById<RecyclerView>(R.id.lagurapRV)
        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.travisscott, "Astroworld", "Travis Scott",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.tyga, "Last King", "Tyga",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.eminem,"MTBMB", "Eminem",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.kendricklamar, "Damn", "Kendrick Lamar",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))
        listlagu.add(itemData(R.drawable.migos, "Culture II", "Migos",R.drawable.theweeknd2, "Save Your Tears","The Weekend", R.drawable.theweeknd2, "Is There Someone Else", "The Weekend", R.drawable.theweeknd2, "Save Your Tears", "The Weekend & Ariana Grande"))

        RecyclerView3.setHasFixedSize(true)
        RecyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView3.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
    //    Function signOut dari akun dan berpindah halaman dengan memangggil function navigateToLoginPage
    private fun logout() {
        FirebaseAuth.getInstance().signOut()
        navigateToLoginPage()
    }

    //    Function untuk berpindah halaman
    private fun navigateToLoginPage() {
        val intent = Intent(this, Login::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
}