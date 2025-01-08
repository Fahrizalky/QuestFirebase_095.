package com.example.activityfirebash.ui.viewModel

import HomeViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activityfirebash.MahasiswaAplication


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiMahasiswa().container.mahasiswaRepository) }
    }
}

fun CreationExtras.aplikasiMahasiswa(): MahasiswaAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaAplication)