package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.databinding.ActivityInfopeliculaBinding
import com.example.listas.databinding.ActivityMainBinding

class Infopelicula : ActivityMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInfopeliculaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}