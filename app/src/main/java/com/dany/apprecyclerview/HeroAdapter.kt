package com.dany.apprecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*


// Create Recycler and adapter

class HeroAdapter(val superhero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int {
        return superhero.size
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    class HeroHolder(val view: View):RecyclerView.ViewHolder(view) {
        fun render(superhero: SuperHero){

            view.tvSuperHero.text = superhero.superHero
            view.tvRealName.text = superhero.realName
            Picasso.get().load(superhero.image).into(view.ivAvatar)
            view.setOnClickListener{ Toast.makeText(view.context, "This superhero is ${superhero.superHero}", Toast.LENGTH_SHORT).show()}

        }

    }

}
