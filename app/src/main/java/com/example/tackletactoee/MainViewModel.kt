package com.example.tackletactoee

import android.content.Context
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

//Business Logic goes here
class MainViewModel() : ViewModel() {

    private lateinit var context: Context
    private var isPlayerXTurn: Boolean? = null
    val winPlayerX = false
    val score = 0

    val currentState = MutableStateFlow(mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0))
    /*
    index equivalent for tic tac toe
    row * 3 + column

    0  1  2 //row 0
    3  4  5 //row 1
    6  7  8 //row 2

    0  1  2 //column

    ex.

    passed in row = 1, column 1 (should be index 4)
    (1 * 3) + 1 = 4
     ^        ^
     row      column

    ---------------------------------------------------
    passed in row = 2, column 2 (should be index 8)
    (2 * 3) + 2 = 8
     ^        ^
     row      column

    for matrix index
    0 = no one
    1 = player X
    2 = player O
     */

    fun init(context: Context) {
        this.context = context
    }

    fun initiateDecisionMade(row: Int, column: Int) {
        viewModelScope.launch {
            currentState.emit(currentState.value.also { it[getProperIndex(row, column)] = if (isPlayerXTurn == true) 1 else 2 })

            //1. check currentState.value for winners
            //2. if winner is found, display a dialog or something?
            //3. reset currentState to all zeros
            //4. increment winning count for player X or player Y
        }
    }

    private fun isWinningRow(row: Int): Boolean {
        val rowIndex = row * 3
        val one = currentState.value[rowIndex]
        val two = currentState.value[rowIndex + 1]
        val three = currentState.value[rowIndex + 2]

        //maybe return 1 or 2 for player X/O... however you want
        return one != 0 && one == two && two == three
    }

    private fun isWinningColumn(column: Int): Boolean {
        val one = currentState.value[column]
        val two = currentState.value[3 + column]
        val three = currentState.value[6 + column]

        //maybe return 1 or 2 for player X/O... however you want
        return one != 0 && one == two && two == three
    }

    private fun getProperIndex(row: Int, column: Int) = row * 3 + column

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