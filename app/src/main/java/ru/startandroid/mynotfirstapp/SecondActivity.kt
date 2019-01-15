package ru.startandroid.mynotfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0
        if (count>0) {
            randomInt = random.nextInt(count + 1)
        }
        textView_random.text = Integer.toString(randomInt)
        textView_label.text = getString(R.string.random_heading, count)
    }

}
