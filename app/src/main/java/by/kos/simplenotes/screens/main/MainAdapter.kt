package by.kos.simplenotes.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import by.kos.simplenotes.databinding.NoteItemBinding
import by.kos.simplenotes.model.AppNote

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    private var mListNotes = emptyList<AppNote>()

    inner class MainHolder(val binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameNote = binding.itemNoteName
        val textNote = binding.itemNoteText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            NoteItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.nameNote.text = mListNotes[position].name
        holder.textNote.text = mListNotes[position].text
    }

    override fun getItemCount(): Int = mListNotes.size

    fun setList(list: List<AppNote>) {
        mListNotes = list
        notifyDataSetChanged()
    }
}