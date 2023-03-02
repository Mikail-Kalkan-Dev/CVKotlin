package com.lidem.cfa.cvkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var competenceRecycleView: RecyclerView
    private lateinit var experienceRecyclerView: RecyclerView

    private lateinit var competenceMutableList : MutableList<Competence>
    private lateinit var experienceMutableList: MutableList<Experience>

    private lateinit var competenceAdapter: CompetenceAdapter
    private lateinit var experienceAdapter: ExperienceAdapter









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userImage: ImageView = findViewById(R.id.userImage)
        val userLastName: TextView = findViewById(R.id.userLastName)
        val userFirstName: TextView = findViewById(R.id.userFirstName)
        val userAge: TextView = findViewById(R.id.userAge)
        val userPhone: TextView = findViewById(R.id.userPhone)

        competenceRecycleView = findViewById(R.id.recycle_competence_cards)
        experienceRecyclerView = findViewById(R.id.recycle_experience_cards)

        competenceMutableList = mutableListOf(
            Competence("Laravel","PDO","php",20,"laravel"),
            Competence("JavaScript","Cool","js",70,"javascript"),
            Competence("Kotlin","Test","KT",20,"kotlin"),
            Competence("Swift","Test","SF",20,"swift"),
            Competence("Java","Test","build",30,"java"),
        )

        experienceMutableList = mutableListOf(
            Experience("Simplon","DeveloppeurWeb","1 an"),
            Experience("UNIVR","DeveloppeurWeb","3 mois"),
            Experience("Kori","Concepeut Developpeur","null"),
        )



        competenceAdapter = CompetenceAdapter(competenceMutableList)
        experienceAdapter = ExperienceAdapter(experienceMutableList)


        competenceRecycleView.adapter = competenceAdapter
        competenceRecycleView.setHasFixedSize(true)
        competenceRecycleView.layoutManager = LinearLayoutManager(this)

        experienceRecyclerView.adapter = experienceAdapter
        experienceRecyclerView.setHasFixedSize(true)
        experienceRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}