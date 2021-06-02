package com.example.appclonesantanderdevweek.data.local


import com.example.appclonesantanderdevweek.data.Cartao
import com.example.appclonesantanderdevweek.data.Cliente
import com.example.appclonesantanderdevweek.data.Conta


// Dados Mocados
class FakeData {


    fun getLocalData() : Conta {
        var cliente = Cliente("André")
        val cartao = Cartao("789")
        return Conta(
            "0101856-2",
            "3330",
            "R$ 500.000,00",
            "R$ 505.000,00",
            cliente,
            cartao
        )
    }
}