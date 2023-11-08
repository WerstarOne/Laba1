package kt.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var editText : EditText
    private lateinit var button: Button
    private lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        result = findViewById(R.id.result)

        button.setOnClickListener {
            val inputText = editText.text.toString()
            val message = when {
                inputText.matches(Regex("[0-9]")) -> "Это цифра!"
                inputText.matches(Regex("[&#<]")) -> "Это спец символ!"
                else -> "Непредусмотренный вариант!"
            }
            result.text = message
        }
    }

}