package com.nurpajria.politeknik

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManajemenInformatika: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manajemen_informatika)
        // Ambil data yang dikirim dari MainActivity
        val page = intent.getStringExtra("page")


        val btnBack = findViewById<Button>(R.id.btnback1)
        btnBack.setOnClickListener {
            finish()

        }
    }
}