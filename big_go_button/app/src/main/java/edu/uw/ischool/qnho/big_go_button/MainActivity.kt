package edu.uw.ischool.qnho.big_go_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import android.content.Context
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0;

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            count++
            changeBtn(this, btn, count)
        }
    }
}

fun changeBtn(context: Context, btn: Button, count: Int){
    val timeText = if (count == 1) "time" else "times"
    btn.text = context.getString(R.string.btn_text, count, timeText)
    btn.setBackgroundColor(getRandColor())
    btn.setTextColor(getRandColor())
}

fun getRandColor(): Int {
    val random = Random()
    return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))
}