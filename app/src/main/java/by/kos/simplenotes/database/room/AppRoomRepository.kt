package by.kos.simplenotes.database.room

import androidx.lifecycle.LiveData
import by.kos.simplenotes.database.DatabaseRepository
import by.kos.simplenotes.model.AppNote

class AppRoomRepository(private val appRoomDAO: AppRoomDAO): DatabaseRepository {
    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDAO.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDAO.insert(note)
        onSuccess()
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDAO.delete(note)
        onSuccess()
    }

    override fun signOut() {
        super.signOut()
    }
}