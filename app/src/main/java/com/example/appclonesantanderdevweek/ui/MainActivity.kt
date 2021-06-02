package com.example.appclonesantanderdevweek.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

import com.example.appclonesantanderdevweek.R
import kotlinx.android.synthetic.main.activity_login_usuario.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Main)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        iv_acesso.setOnClickListener {
            openNextActivity()
        }

    }
    private fun openNextActivity(){
        val intent = Intent(this, LoginUsuario::class.java)
        startActivity(intent)
    }

    // Inflando o menu 1 no layout
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu_activity_main, menu)
        return true
    }


}