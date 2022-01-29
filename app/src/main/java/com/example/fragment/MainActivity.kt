package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    var isFragmentOneLoaded = true;
    val manager = supportFragmentManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Change : Button = findViewById(R.id.btn);
        FragmentOne()
       Change.setOnClickListener({
           if(isFragmentOneLoaded){
               ShowFragmentTwo()
           }
       })
    }
    fun ShowFragmentOne(){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.Frame,FragmentOne())
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true;
    }
    fun ShowFragmentTwo(){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.Frame, FragmentTwo())
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = false;
    }
}