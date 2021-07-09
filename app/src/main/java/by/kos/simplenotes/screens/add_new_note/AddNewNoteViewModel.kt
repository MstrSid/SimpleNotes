package by.kos.simplenotes.screens.add_new_note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import by.kos.simplenotes.model.AppNote
import by.kos.simplenotes.utils.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddNewNoteViewModel(application: Application): AndroidViewModel(application) {

    fun insert(note: AppNote, onSuccess:() -> Unit){
        viewModelScope.launch(Dispatchers.IO) {
            REPOSITORY.insert(note){
                onSuccess()
            }
        }
    }
}