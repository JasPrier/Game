package com.example.tackletactoee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class WinnerPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner_page)

        val nextPage : Button = findViewById(R.id.backToHome)

        nextPage.setOnClickListener{
            val toast = Toast.makeText(this,"Back To Home", Toast.LENGTH_SHORT)
            toast.show()



        }
    }
// Thd score board was put in place to
    private fun scoreBoard(){

        val scoreX = ScoreX ()
        val scoreO =
    }
}

class ScoreX (private val score: Int){
    /* This is the score for X */

    fun Xx (): Int{
        return

    }

}

class ScoreO (private val score: Int ){
    /*This is the score for O*/

    fun Oo (): Int{

    }
}