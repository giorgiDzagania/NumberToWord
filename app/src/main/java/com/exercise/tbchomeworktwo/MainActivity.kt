package com.exercise.tbchomeworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterNumber = findViewById<EditText>(R.id.editText)
        val convertButton = findViewById<Button>(R.id.button)
        val resultText:TextView = findViewById(R.id.resultText)

        var validNumArray = arrayOf(1..1000)

        val numbertoword = ExerciseArrays()

        convertButton.setOnClickListener {
            var userInput = enterNumber.text.toString()

            if (userInput.isNotEmpty()){
                var number = userInput.toInt()
                if (number in 1..1000){
                    var n = number.toInt()
                    val result = numbertoword.userInputNumber(n)
                    resultText.text = result
                }else{
                    Toast.makeText(this@MainActivity,
                        "გთხოვთ შეიყვანოთ რიცხვები მხოლოდ 1 დან 1000-ის ჩათვლით",
                        Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "შეიყვანეთ რიცხვი", Toast.LENGTH_SHORT).show()
            }
        }

    }


}