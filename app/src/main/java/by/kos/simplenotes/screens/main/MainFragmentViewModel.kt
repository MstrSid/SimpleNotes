package by.kos.simplenotes.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import by.kos.simplenotes.utils.REPOSITORY

class MainFragmentViewModel(application: Application): AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
    fun signOut(){
        REPOSITORY.signOut()
    }
}