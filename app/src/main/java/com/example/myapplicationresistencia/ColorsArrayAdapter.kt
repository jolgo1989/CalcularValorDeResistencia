package com.example.myapplicationresistencia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.colorspinner.view.*

class ColorsArrayAdapter (ctx: Context,
                          moods: List<Colors>) :
    ArrayAdapter<Colors>(ctx, 0, moods) {
    override fun getView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    override fun getDropDownView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    private fun createView(position: Int, recycledView: View?, parent: ViewGroup): View {
        val mood = getItem(position)
        val view = recycledView ?: LayoutInflater.from(context).inflate(
            R.layout.colorspinner,
            parent,
            false
        )

        mood?.backgroundColor?.let { view.rootLayout.setBackgroundColor(it) }
        view.textViewColors.text = mood?.description
        return view
    }
}