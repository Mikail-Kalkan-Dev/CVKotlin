package com.lidem.cfa.cvkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ExperienceAdapter (val experiences: MutableList<Experience>): RecyclerView.Adapter<ExperienceAdapter.ViewHolder>() {

    //inner class de CompetenceAdapter  | class imbriquer aucun raison d'exiter sans la class parent
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val cardView = itemView.findViewById<CardView>(R.id.experienceCard)

        val title = itemView.findViewById<TextView>(R.id.cardTitle)
        val subtitle = itemView.findViewById<TextView>(R.id.cardSubTitle)
        val info = itemView.findViewById<TextView>(R.id.cardInfo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem: View = LayoutInflater.from(parent.context).inflate(R.layout.experience_card, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val experience = experiences[position]

        holder.cardView.tag = position

//        holder.cardView.setOnClickListener(itemClickListener)


        holder.title.text = experience.title
        holder.subtitle.text = experience.subtitle
        holder.info.text = experience.info
    }

    override fun getItemCount(): Int {
        return experiences.size
    }

}