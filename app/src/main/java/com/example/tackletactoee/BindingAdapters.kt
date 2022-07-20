package com.example.tackletactoee

import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("app:ticTacToe")
fun Button.setTicTacToe(indexValue: Int) {
    when (indexValue) {
        0 -> {
            //no one
            setBackgroundColor(ContextCompat.getColor(context, R.color.purple_500))
            text = ""
        }
        1 -> {
            //player X
            setBackgroundColor(ContextCompat.getColor(context, R.color.teal_700))
            text = "X"
        }
        2 -> {
            //player O
            setBackgroundColor(ContextCompat.getColor(context, R.color.white))
            text = "O"
        }
    }
}
