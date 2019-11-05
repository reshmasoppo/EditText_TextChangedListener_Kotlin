package com.example.edittext_textchangedlistener_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
   // var textview:TextView?=null
  //  var editText:EditText?=null
  //  var inputValue:String?=null

    lateinit var editText: EditText
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

       // get reference to textview

           textView=findViewById<TextView>(R.id.text_id)
           editText=findViewById<EditText>(R.id.editText_id)

        // set on-click listener
           button.setOnClickListener {

               val inputValue: String = editText.text.toString()
               textView.setText(inputValue)
         }


    }
}
