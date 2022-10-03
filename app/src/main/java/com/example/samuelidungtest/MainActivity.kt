package com.example.samuelidungtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.Format

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvInput = findViewById<TextView>(R.id.tvInput)
        val firstNum = findViewById<EditText>(R.id.Num1)
        val secoNum = findViewById<EditText>(R.id.Num2)
        val Addit = findViewById<Button>(R.id.btn_Add)
        val Sub = findViewById<Button>(R.id.btn_Sub)
        val Mult = findViewById<Button>(R.id.btn_Mltiply)
        val Div = findViewById<Button>(R.id.btn_Divid)
        val Reset = findViewById<Button>(R.id.btn_reset)


        Addit.setOnClickListener {
            if (firstNum.text.toString().isEmpty()){
                Toast.makeText(this, "Sorry! you have not enter the first number please input!" , Toast.LENGTH_SHORT).show()
            }else if (secoNum.text.toString().isEmpty()){
                Toast.makeText(this, "Sorry! you have not enter the second number please input!" , Toast.LENGTH_SHORT).show()
            }else{
                val y =  Addit(firstNum.text.toString().toInt(), secoNum.text.toString().toInt())
                tvInput.text = "The addition of both numbers is $y"
            }
    }


        Sub.setOnClickListener {

            val y =  Sub(firstNum.text.toString().toInt(), secoNum.text.toString().toInt())
            tvInput.text = "The subtraction of both numbers is $y"
        }

        Mult.setOnClickListener {
            val y =  Mult(firstNum.text.toString().toInt(), secoNum.text.toString().toInt())
            tvInput.text = "The Multiplication of both numbers is $y"
        }

        Div.setOnClickListener {
            val y =  Div(firstNum.text.toString().toInt(), secoNum.text.toString().toInt())
            tvInput.text = "The division of both numbers is $y"
        }

        Reset.setOnClickListener {
            tvInput.text = ""
        }






    }



    fun Addit(x: Int, y: Int): Int{
        return x + y
    }

    fun Sub(x: Int, y: Int): Int{
        return x - y
    }

    fun Mult(x: Int, y: Int): Int {
        return x * y
    }

    fun Div(x: Int, y: Int): Int{
        return x / y
    }


    }


