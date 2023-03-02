package com.lidem.cfa.cvkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class CompetenceAdapter(val competences: MutableList<Competence>):RecyclerView.Adapter<CompetenceAdapter.ViewHolder>() {

    //inner class de CompetenceAdapter  | class imbriquer aucun raison d'exiter sans la class parent
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


        val cardView = itemView.findViewById<CardView>(R.id.competenceCard)

        val image = itemView.findViewById<ImageView>(R.id.cardImage)
        val title = itemView.findViewById<TextView>(R.id.cardTitle)
        val subtitle = itemView.findViewById<TextView>(R.id.cardSubTitle)
        val info = itemView.findViewById<TextView>(R.id.cardInfo)
        val lvl = itemView.findViewById<TextView>(R.id.cardLvl)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem: View = LayoutInflater.from(parent.context).inflate(R.layout.competence_card, parent, false)

        println("JE SUIS PASSSER DANS COMPETENCE onCreateViewHolder")
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val competence = competences[position]
        val currentContext = holder.cardView.context
        val ressourceId = currentContext.resources.getIdentifier(competence.image,"drawable",currentContext!!.packageName)

        println("JE SUIS PASSSER DANS COMPETENCE ADAPTER")
        println(competence.title)
        holder.cardView.tag = position

//        holder.cardView.setOnClickListener(itemClickListener)

        holder.image.setImageResource(if (ressourceId!=0) ressourceId else R.drawable.ic_launcher_foreground)
//        holder.image.setOnClickListener(itemClickListener)
        holder.image.tag = if (ressourceId!=0) competence.image else "no image"

        holder.title.text = competence.title
        holder.subtitle.text = competence.subtitle
        holder.info.text = competence.info
        holder.lvl.text = "${competence.lvl} lvl"

    }

    override fun getItemCount(): Int {
        return competences.size
    }

}