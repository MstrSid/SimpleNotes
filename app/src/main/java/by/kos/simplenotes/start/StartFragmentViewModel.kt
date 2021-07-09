package by.kos.simplenotes.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import by.kos.simplenotes.database.room.AppRoomDatabase
import by.kos.simplenotes.database.room.AppRoomRepository
import by.kos.simplenotes.utils.REPOSITORY
import by.kos.simplenotes.utils.TYPE_ROOM

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application

    fun initDatabase(type: String, onSuccess:()->Unit){

        when(type){
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }
}