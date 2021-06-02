package com.example.appclonesantanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.example.appclonesantanderdevweek.R
import com.example.appclonesantanderdevweek.data.Conta
import kotlinx.android.synthetic.main.activity_login_usuario.*


class ActivityUsuario : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        setTheme(R.style.Theme_CloneAppSantander)
        setContentView(R.layout.activity_usuario)
        setSupportActionBar(findViewById(R.id.toolbar))
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java) // Construindo o mainViewModel que será instanciado depois
        buscarContaCliente()

    }

    // função que passa os dados para a MainActivity exibir
    private fun buscarContaCliente(){
        mainViewModel.buscarContaCliente().observe(this, Observer { result ->
            bindOnView(result)
        })
    }

    // função para inflar os dados no Observe
    private fun bindOnView(conta: Conta) {
        var intent = intent
        val nome = intent.getStringExtra("EXTRA_NOME")

        val tvUsuario : TextView = findViewById(R.id.tv_usuario)
        tvUsuario.setText(nome)

        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite).text = conta.limite
        findViewById<TextView>(R.id.tv_cartao_final_value).text = conta.cartao.numeroCartao
    }

    // Inflando o menu 3 no layout
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }


}