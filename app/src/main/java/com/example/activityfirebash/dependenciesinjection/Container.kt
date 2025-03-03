package com.example.activityfirebash.dependenciesinjection

import com.example.activityfirebash.repository.MahasiswaRepository
import com.example.activityfirebash.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer : AppContainer{
    private val firestore: FirebaseFirestore =FirebaseFirestore.getInstance()
    override val mahasiswaRepository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firestore)
    }
}