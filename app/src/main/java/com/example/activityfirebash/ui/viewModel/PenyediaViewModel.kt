package com.example.activityfirebash.ui.viewModel


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activityfirebash.MahasiswaAplication
import com.example.activityfirebash.viewmodel.HomeViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer { HomeViewModel(aplikasiMahasiswa().container.mahasiswaRepository) }
        initializer { InsertViewModel(aplikasiMahasiswa().container.mahasiswaRepository) }

    }
}

fun CreationExtras.aplikasiMahasiswa(): MahasiswaAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaAplication)

