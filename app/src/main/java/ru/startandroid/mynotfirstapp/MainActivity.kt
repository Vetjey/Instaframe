package ru.startandroid.mynotfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.RandomAccessFile

class MainActivity : AppCompatActivity() {


    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countMe(view: View){
        val countString = main_text.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        main_text.text = count.toString()
    }

    fun zeroMe(view: View){
        var count: Int = 0
        main_text.text=count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = main_text.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

}
