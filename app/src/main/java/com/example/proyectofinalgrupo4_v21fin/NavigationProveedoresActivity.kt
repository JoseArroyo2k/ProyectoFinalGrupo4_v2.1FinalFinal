package com.example.proyectofinalgrupo4_v21fin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NavigationProveedoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_proveedores)

        val btnMP:ImageView=findViewById(R.id.ivMisProductos)
        val btnMP2:TextView=findViewById(R.id.tvMisProductos)

        btnMP.setOnClickListener {
            val intent = Intent(this, MyProdsActivity::class.java)
            startActivity(intent)
        }
        btnMP2.setOnClickListener {
            val intent = Intent(this, MyProdsActivity::class.java)
            startActivity(intent)
        }

    }




}