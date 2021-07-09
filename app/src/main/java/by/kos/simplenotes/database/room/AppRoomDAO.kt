package by.kos.simplenotes.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import by.kos.simplenotes.model.AppNote

@Dao
interface AppRoomDAO {

    @Query("SELECT * FROM notes_table")
    fun getAllNotes(): LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}