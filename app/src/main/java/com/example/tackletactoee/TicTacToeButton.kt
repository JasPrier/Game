package com.example.tackletactoee

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class TicTacToeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    var row = 0
    var column = 0
}