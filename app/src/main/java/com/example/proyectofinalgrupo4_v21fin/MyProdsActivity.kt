package com.example.proyectofinalgrupo4_v21fin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyProdsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_prods)

        val btnEdit:Button = findViewById(R.id.btnEditMyProd)

        btnEdit.setOnClickListener {
            val intent = Intent(this, EditProductInfoActivity::class.java)
            startActivity(intent)
        }
    }
}