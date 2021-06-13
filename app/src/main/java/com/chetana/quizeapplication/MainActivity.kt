package com.chetana.quizeapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    lateinit var parent: Context

    var edtname:EditText?=null
    var btnsave:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        init()

        setListeners()

    }

    fun init(){
        parent = MainActivity()

        edtname = findViewById(R.id.edtname) as EditText
        btnsave = findViewById(R.id.btnsave) as Button
    }

    fun setListeners(){

        btnsave?.setOnClickListener {
            if(edtname?.text.toString().isEmpty()){
                Toast.makeText(parent,"Please enter name",Toast.LENGTH_SHORT).show()
            }else{
                var intent:Intent= Intent(this,QuestionActivity::class.java)
                intent.putExtra("name",edtname?.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
