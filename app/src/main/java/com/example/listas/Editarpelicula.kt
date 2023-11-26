package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.databinding.ActivityEditarpeliculaBinding
import com.example.listas.databinding.ActivityMainBinding

class Editarpelicula : ActivityMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEditarpeliculaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}