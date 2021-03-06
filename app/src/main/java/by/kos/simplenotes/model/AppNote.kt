package by.kos.simplenotes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "notes_table")
data class AppNote(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo
    val name: String = "",

    @ColumnInfo
    val text: String = "",

    val id_firebase: String = "",

) : Serializable