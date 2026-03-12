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

        val firstName= "Alexa"
        val lastName= "Jaftha"
        val addressName= "1 Waterford Circle, Kirstenhof"
        val isMale= "False"
        val dayOfBirth= "17"
        val monthOfBirth= "November"
        val yearOfBirth= "2007"

        Log.d("Hi", firstName+ ""+ lastName + "You are located at" + addressName+
        "It is"+ isMale +"That you are male."+ "You were born in"+ ""+ dayOfBirth+ ""+ monthOfBirth +"" +"" +
        yearOfBirth )


        //We are calculating the number of years until the student turns 100
        val studentAge= 18
        val yearsUntilOneHundred= 100-studentAge
        val studentAgeMonths= yearsUntilOneHundred*12
        val studentAgeDays= yearsUntilOneHundred*365
        val remainderDays=studentAge%5

        Log.d("Hi","There are"+ yearsUntilOneHundred+"years until you turn one hundred."+ "You have"
        + studentAgeMonths+ "Until you turn 100."+ "There are"+ studentAgeDays +"until you turn 100")
        Log.d("The remainder when your age is divided by 5 is:","" + remainderDays)










        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            insets
        }
    }
}