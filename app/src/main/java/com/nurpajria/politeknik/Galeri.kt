package com.nurpajria.politeknik

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nurpajria.politeknik.adapter.PhotoGrid

class Galeri : AppCompatActivity() {

    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.pnp1,
        R.drawable.pnp2,
        R.drawable.pnp3, // Ensure no duplicate resources
        R.drawable.ic_launcher_foreground,
        R.drawable.pnp5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)


        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = PhotoGrid(this, imageList)
        gridView.adapter = adapter


        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, PhotoDetails::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}