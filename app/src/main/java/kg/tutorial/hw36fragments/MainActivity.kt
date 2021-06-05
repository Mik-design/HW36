package kg.tutorial.hw36fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Button
import androidx.fragment.app.FragmentManager
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
//    lateinit var button1: Button
//    lateinit var button2: Button
//    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button1 = findViewById(R.id.but1)
//        button2 = findViewById(R.id.but2)
//        button3 = findViewById(R.id.but3)

        val fragment1 = Fragment1()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.mainlayout, fragment1).commit()
    }
}