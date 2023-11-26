package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.adapter.FilmAdapter
import com.example.listas.databinding.ActivityMainBinding

class MainActivity : ActivityMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        //val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //binding.buscar.setOnClickListener{
       //     binding.buscar.isInvisible = false
       // }

       // FilmProvider.filmList[2].title

        binding.recycler.layoutManager = LinearLayoutManager(this)
        //binding.recycler.layoutManager = GridLayoutManager(this, 2) //Poner en columnas las películas
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
      //  binding.recycler.addItemDecoration(decoration)
    }
}