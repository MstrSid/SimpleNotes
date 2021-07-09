package by.kos.simplenotes.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import by.kos.simplenotes.R
import by.kos.simplenotes.databinding.FragmentStartBinding
import by.kos.simplenotes.utils.APP_ACTIVITY
import by.kos.simplenotes.utils.TYPE_ROOM

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!
    private lateinit var mViewModel: StartFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        mViewModel = ViewModelProvider(this).get(StartFragmentViewModel::class.java)
        binding.btnRoom.setOnClickListener {
            mViewModel.initDatabase(TYPE_ROOM){
                APP_ACTIVITY.mNavController.navigate(R.id.action_startFragment_to_mainFragment)
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}