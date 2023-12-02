package com.example.proyectofinalgrupo4_v21fin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore

class EditProductInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_product_info)

        val btnBack: Button = findViewById(R.id.btnBackCPN)
        val txtNameProd: EditText = findViewById(R.id.ProdName)
        val txtDescProd: EditText = findViewById(R.id.editTextTextMultiLine)
        val txtPrice: EditText = findViewById(R.id.editTextTextPrice)

        txtNameProd.isEnabled=false
        txtDescProd.isEnabled=false
        txtPrice.isEnabled=false

        val btnEditName: Button = findViewById(R.id.button3)
        val btnEditDesc: Button = findViewById(R.id.button4)
        val btnEditPrice: Button = findViewById(R.id.button5)

        val btnSaveEdit: Button = findViewById(R.id.btnSaveEditProd)

        val auth = FirebaseAuth.getInstance()
        val db = FirebaseFirestore.getInstance()

        val collectionRef = db.collection("Productos")

        btnEditName.setOnClickListener {
            txtNameProd.isEnabled=true
            txtNameProd.setBackgroundColor(Color.parseColor("#B2EEA2"))
        }
        btnEditDesc.setOnClickListener {
            txtDescProd.isEnabled=true
            txtDescProd.setBackgroundColor(Color.parseColor("#B2EEA2"))
        }
        btnEditPrice.setOnClickListener {
            txtPrice.isEnabled=true
            txtPrice.setBackgroundColor(Color.parseColor("#B2EEA2"))
        }


        btnSaveEdit.setOnClickListener {
            val nombre = txtNameProd.text.toString()
            val desc = txtDescProd.text.toString()
            val precio = txtPrice.text.toString()

            txtNameProd.isEnabled=false
            txtDescProd.isEnabled=false
            txtPrice.isEnabled=false
        }

    }
}