package com.anwesh.uiprojects.linkedrotbuglineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rotbuglineview.RotBugLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RotBugLineView.create(this)
    }
}
