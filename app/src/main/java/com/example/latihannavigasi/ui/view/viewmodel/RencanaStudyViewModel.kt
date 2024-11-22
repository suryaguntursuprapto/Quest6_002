package com.example.latihannavigasi.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihannavigasi.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy() }
    }
    fun setKelas(kelasPilihan: String){
        _krsState.update { stateKelas -> stateKelas.copy(kelas = kelasPilihan) }
    }
}