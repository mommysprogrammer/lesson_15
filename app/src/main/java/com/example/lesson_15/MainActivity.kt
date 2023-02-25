package com.example.lesson_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.lesson_15.ConvertUtils.Companion.convertMeterParrot
import com.example.lesson_15.ConvertUtils.Companion.convertParrotMeter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meterRadioButton: RadioButton = findViewById(R.id.radioButtonMeter)
        val inputEditText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.buttonConverter)

        button.setOnClickListener {
            if (inputEditText.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Введите длину кота",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val inputValue = inputEditText.text.toString().toFloat()
                if (meterRadioButton.isChecked) {
                    inputEditText.setText(convertParrotMeter(inputValue).toString())
                } else {
                    inputEditText.setText(convertMeterParrot(inputValue).toString())
                }
            }
        }
    }
}