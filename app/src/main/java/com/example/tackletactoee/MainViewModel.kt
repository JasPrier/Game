package com.example.tackletactoee

import android.content.Context
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

//Business Logic goes here
class MainViewModel() : ViewModel() {

    private lateinit var context: Context
    private var isPlayerXTurn: Boolean? = null
    val winPlayerX = false
    val score =

    fun init(context: Context) {
        this.context = context
    }
// this is saying that i
    fun initiateDecisionMade(view: View) {
        if(isPlayerXTurn == true){
            view.setBackgroundColor(context.resources.getColor(R.color.teal_700))
        } else {
            view.setBackgroundColor(context.resources.getColor(R.color.white))
        }
        Log.d("Jasmine", "isPlayerX's turn: $isPlayerXTurn")
    }

    fun onPlayerChecked(checkedId: Int) {
        isPlayerXTurn = checkedId == R.id.player_x
    }

    // Todo: figure what a win is, maybe store in array
    // Todo: keep track of each players mark and score

    //For the score
// When the user clicks

        //when the buttn is clicked then the score will increase
        open class Array



}