package com.example.listas

import android.app.AlertDialog
import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class ActivityMenus : AppCompatActivity(){
    companion object{
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.listadopelis, menu)

        for (i in 0 until menu.size()){
            if (i== actividadActual) menu.getItem(i).isEnabled = false
            else menu.getItem(i).isEnabled = true
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.peliculas -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 0;
                startActivity(intent)
                true
            }
            R.id.anadir -> {
                val intent = Intent(this, Editarpelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 1;
                startActivity(intent)
                true
            }
            R.id.app -> {
                val intent = Intent(this, Infopelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 2;
                startActivity(intent)
                true
            }
            R.id.exit -> {
                AlertDialog.Builder(this)
                    .setTitle("Confirmación")
                    .setMessage("¿Desea salir de la aplicación?")
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok, { dialog, which ->
                        Toast.makeText(applicationContext, "OK", Toast.LENGTH_SHORT).show()
                    })
                    .setNegativeButton(android.R.string.cancel,  { dialog, which ->
                        Toast.makeText(applicationContext, "CANCEL", Toast.LENGTH_SHORT).show()
                    })
                    .show()

                return true // Indica que el evento ha sido manejado
            }

            R.id.search -> {
                val buscarEditText = findViewById<EditText>(R.id.search)

                // Verificar si el EditText está visible
                if (buscarEditText.visibility == View.VISIBLE) {
                    // Si está visible, ocultarlo
                    buscarEditText.visibility = View.INVISIBLE
                } else {
                    // Si está oculto, mostrarlo
                    buscarEditText.visibility = View.VISIBLE
                }

                true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}