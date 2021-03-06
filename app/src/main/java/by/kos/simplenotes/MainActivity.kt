package by.kos.simplenotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import by.kos.simplenotes.databinding.ActivityMainBinding
import by.kos.simplenotes.utils.APP_ACTIVITY
import by.kos.simplenotes.utils.AppPreference
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: MaterialToolbar
    lateinit var navController: NavController

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_ACTIVITY = this
        mToolbar = binding.toolbar
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
        title = getString(R.string.app_name)
        AppPreference.getPreferences(this)
    }
}