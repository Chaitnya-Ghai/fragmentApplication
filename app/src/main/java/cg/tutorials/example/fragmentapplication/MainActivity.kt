package cg.tutorials.example.fragmentapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cg.tutorials.example.fragmentapplication.databinding.ActivityMainBinding
import cg.tutorials.example.fragmentapplication.fragments.ActivityInterface

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var activityInterface: ActivityInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ActivityPress.setOnClickListener{
            activityInterface.changeTxtColor()
        }
    }
    fun changeTxtColor(){
        binding.ActivityPress.setText("change from fragment")
    }
}
