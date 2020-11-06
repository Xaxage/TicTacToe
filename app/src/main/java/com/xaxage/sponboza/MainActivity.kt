package com.xaxage.sponboza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var notOver:Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun buClick(view: View) {//"view"'ll represent the button we clicked.We could set onClickListener to any button, but it is too long.
        val buSelected=view as Button//We converted it view int Button


            var cellId = 0

            when (buSelected.id) {
                R.id.button1 -> cellId = 1
                R.id.button2 -> cellId = 2
                R.id.button3 -> cellId = 3
                R.id.button4 -> cellId = 4
                R.id.button5 -> cellId = 5
                R.id.button6 -> cellId = 6
                R.id.button7 -> cellId = 7
                R.id.button8 -> cellId = 8
                R.id.button9 -> cellId = 9
            }
        //=========

            //Log.d("buClick",buSelected.id.toString())
            //Log.d("buClick",cellId.toString())
        if(notOver)
        {
            playGame(cellId, buSelected)

        }




    }

    var activePlayer=1//By default active player is player 1

    var player1=ArrayList<Int>()//We'll save info of which cells player 1 selected
    var player2=ArrayList<Int>()//We'll save info of which cells player 2 selected

    fun playGame(cellId:Int,buSelected:Button){

        if(activePlayer==1){
            buSelected.text="X"
            buSelected.setBackgroundResource(R.color.blue)
            player1.add(cellId)
            activePlayer=2

        }else{
            buSelected.text="O"
            buSelected.setBackgroundResource(R.color.darkGreen)
            player2.add(cellId)
            activePlayer=1

        }

        buSelected.isEnabled=false

        checkWinner()
    }



    fun checkWinner(){

        var winner:Int=0

        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1
        }

        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2
        }


        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1
        }

        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2
        }


        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1
        }

        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2
        }


        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1
        }

        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner=2
        }


        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winner=1
        }

        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=2
        }


        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1
        }

        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2
        }


        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1
        }

        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2
        }


        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1
        }

        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner=2
        }


        if(winner==1){
            Toast.makeText(this,"Player1 won the game",Toast.LENGTH_LONG).show()
            notOver=false
        }else if (winner==2){
            Toast.makeText(this,"Player2 won the game",Toast.LENGTH_LONG).show()
            notOver=false
        }



    }


}
