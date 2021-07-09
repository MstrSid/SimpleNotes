package by.kos.simplenotes.screens.add_new_note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import by.kos.simplenotes.R
import by.kos.simplenotes.databinding.FragmentAddNewNoteBinding
import by.kos.simplenotes.model.AppNote
import by.kos.simplenotes.utils.APP_ACTIVITY
import by.kos.simplenotes.utils.showToast

class AddNewNoteFragment : Fragment() {

    private var _binding: FragmentAddNewNoteBinding? = null
    private val binding get() = _binding!!
    private lateinit var mViewModel: AddNewNoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddNewNoteBinding.inflate(inflater, container, false)
        mViewModel = ViewModelProvider(this).get(AddNewNoteViewModel::class.java)
        binding.btnAddNote.setOnClickListener {
            val name = binding.btnAddNote.text.toString()
            val text = binding.inputNameNote.text.toString()
            if(name.isEmpty()){
                showToast(getString(R.string.toast_enter_name))
            } else{
                mViewModel.insert(AppNote(name = name, text = text)){
                    APP_ACTIVITY.mNavController.navigate(R.id.action_addNewNoteFragment_to_mainFragment)
                }
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}