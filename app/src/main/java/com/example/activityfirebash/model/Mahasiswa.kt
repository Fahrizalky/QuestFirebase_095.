package com.example.activityfirebash.model

class Mahasiswa (
    val nim: String,
    val nama: String,
    val kelas : String,
    val alamat : String,
    val jenis_kelamin : String,
    val angkatan : String,
    val judul_skripsi : String,
    val dospem_satu : String,
    val dospem_dua : String

){
    constructor():this("","","","","","","","","")
}
