package com.example.appclonesantanderdevweek.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText
import android.widget.Toast

import com.example.appclonesantanderdevweek.R
import kotlinx.android.synthetic.main.activity_login_usuario.*

class LoginUsuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_CloneAppSantander)
        setContentView(R.layout.activity_login_usuario)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_acessar.setOnClickListener {
            loginUsuario()
        }
    }

    private fun loginUsuario(){
        val editNome = findViewById<EditText>(R.id.h_nome)
        var nome = editNome.text.toString()

        if (nome != ""){
            val intent = Intent(this, ActivityUsuario::class.java)
            intent.putExtra("EXTRA_NOME", nome)
            startActivity(intent)
        } else{
            Toast.makeText(this, "O nome precisa ser digitado", Toast.LENGTH_LONG).show()
        }
    }

    // Inflando o menu 3 no layout
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu_activity_main, menu)
        return true
    }




}