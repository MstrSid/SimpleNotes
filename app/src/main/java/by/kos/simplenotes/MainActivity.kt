package by.kos.simplenotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import by.kos.simplenotes.databinding.ActivityMainBinding
import by.kos.simplenotes.utils.APP_ACTIVITY
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: MaterialToolbar
    lateinit var mNavController: NavController

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_ACTIVITY = this
        mToolbar = binding.toolbar
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
    }
}