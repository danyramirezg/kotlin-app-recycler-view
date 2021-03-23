package com.dany.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var superHeros: List<SuperHero> = listOf(
        SuperHero("Wonder Woman",  "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"),
        SuperHero("Green Lantern", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
        SuperHero("Flash", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
        SuperHero("Batman", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        SuperHero("Spiderman", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg" ),
        SuperHero("Wolverine", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        SuperHero("Thor", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(superHeros[0].realName)
        initRecycler()
    }

    fun initRecycler(){
        rvSuperHero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superHeros)
        rvSuperHero.adapter = adapter
    }
}

