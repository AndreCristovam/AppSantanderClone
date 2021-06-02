package com.example.appclonesantanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.appclonesantanderdevweek.data.Conta
import com.example.appclonesantanderdevweek.data.local.FakeData

class MainViewModel : ViewModel() {

    // Definindo o LiveData mutável
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }

}