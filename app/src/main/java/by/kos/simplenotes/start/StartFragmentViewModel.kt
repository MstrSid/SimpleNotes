package by.kos.simplenotes.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application

    fun initDatabase(type: String){}
}