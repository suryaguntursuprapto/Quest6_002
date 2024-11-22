package com.example.latihannavigasi.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.latihannavigasi.model.Mahasiswa
import com.example.latihannavigasi.model.RencanaStudi

@Composable
fun DetailMahasiswaView(
    modifier: Modifier = Modifier,
    dataMhs: Mahasiswa,
    dataKrs: RencanaStudi,
    onSubmitClick: () -> Unit
){
    val listDataMhs = listOf(
        Pair("Nim", dataMhs.nim),
        Pair("Nama", dataMhs.nama),
        Pair("Email", dataMhs.email),
        Pair("MataKuliah", dataKrs.mataKuliah),
        Pair("Kelas", dataKrs.kelas),
    )

    Column (
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ){
        listDataMhs.forEach{ data ->
            DetailMhs(judul = data.first,
                isinya = data.second)

        }
    }
}

@Composable
fun DetailMhs(
    judul: String, isinya: String
){
    Column (
        modifier = Modifier.fillMaxWidth(),
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        Row (modifier = Modifier.fillMaxWidth().padding(top = 2.dp)){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.8f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }
    }
}