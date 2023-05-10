package com.example.michelpatty_20411110_projectakhir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

//Lagu R&B
        val RecyclerView = findViewById<RecyclerView>(R.id.lagurnbRV)

        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.theweeknd,R.drawable.favorite_icon, "After Hours", "The Weeknd"))
        listlagu.add(itemData(R.drawable.drake,R.drawable.favorite_icon, "Scorpion", "Drake"))
        listlagu.add(itemData(R.drawable.postmalone,R.drawable.favorite_icon, "Stoney", "Post Malone"))
        listlagu.add(itemData(R.drawable.akon, R.drawable.favorite_icon,"Trouble", "Akon"))
        listlagu.add(itemData(R.drawable.brunomars,R.drawable.favorite_icon, "24K Magic", "Bruno Mars"))

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

        listlagu.add(itemData(R.drawable.lyodra,R.drawable.favorite_icon, "Lyodra", "Lyodra"))
        listlagu.add(itemData(R.drawable.tiaraandini,R.drawable.favorite_icon, "Tiara Andini", "Tiara Andini"))
        listlagu.add(itemData(R.drawable.mahalini,R.drawable.favorite_icon, "Fabula", "Mahalini"))
        listlagu.add(itemData(R.drawable.ziva,R.drawable.favorite_icon, "Magnoliya", "Ziva"))
        listlagu.add(itemData(R.drawable.glenn,R.drawable.favorite_icon, "Kembali", "Glenn Fredly"))

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

        listlagu.add(itemData(R.drawable.diplo,R.drawable.favorite_icon, "Revolution", "Diplo"))
        listlagu.add(itemData(R.drawable.djsnake,R.drawable.favorite_icon, "Encore", "Dj Snake"))
        listlagu.add(itemData(R.drawable.skrillex,R.drawable.favorite_icon, "Recess", "Skrillex"))
        listlagu.add(itemData(R.drawable.martingarrix,R.drawable.favorite_icon, "Martin Garrix", "Martin Garrix"))
        listlagu.add(itemData(R.drawable.yellowclaw, R.drawable.favorite_icon,"New Blood", "Yellow Claw"))

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

        listlagu.add(itemData(R.drawable.travisscott,R.drawable.favorite_icon, "Astroworld", "Travis Scott"))
        listlagu.add(itemData(R.drawable.tyga,R.drawable.favorite_icon, "Last King", "Tyga"))
        listlagu.add(itemData(R.drawable.eminem,R.drawable.favorite_icon,"MTBMB", "Eminem"))
        listlagu.add(itemData(R.drawable.kendricklamar,R.drawable.favorite_icon, "Damn", "Kendrick Lamar"))
        listlagu.add(itemData(R.drawable.migos,R.drawable.favorite_icon, "Culture II", "Migos"))

        RecyclerView3.setHasFixedSize(true)
        RecyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView3.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }



//Baru Diputar
        val RecyclerView4 = findViewById<RecyclerView>(R.id.baruRV)
        listlagu = ArrayList()

        listlagu.add(itemData(R.drawable.travisscott,R.drawable.favorite_icon, "Astroworld", "Travis Scott"))
        listlagu.add(itemData(R.drawable.tyga,R.drawable.favorite_icon, "Last King", "Tyga"))
        listlagu.add(itemData(R.drawable.eminem,R.drawable.favorite_icon, "MTBMB", "Eminem"))
        listlagu.add(itemData(R.drawable.kendricklamar,R.drawable.favorite_icon, "Damn", "Kendrick Lamar"))
        listlagu.add(itemData(R.drawable.migos,R.drawable.favorite_icon, "Culture II", "Migos"))

        RecyclerView4.setHasFixedSize(true)
        RecyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RecyclerView4.adapter = MyAdapter(this, listlagu){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}