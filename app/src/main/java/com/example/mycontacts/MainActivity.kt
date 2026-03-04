package com.example.mycontacts
import android.os.Bundle
import android.text.style.ScaleXSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        var firstName= "Alexa"
        var lastName= "Jaftha"
        var Address= "1 Waterford Circle, Kirstenhof"
        var isMale= "False"
        var dayOfBirth= "17"
        var monthOfBirth= "November"
        var yearOfBirth= "2007"

        Log.d("Hi",firstName+ "" + lastName)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}