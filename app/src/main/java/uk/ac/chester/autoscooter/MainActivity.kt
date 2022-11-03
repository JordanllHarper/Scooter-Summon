package uk.ac.chester.autoscooter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.children
import uk.ac.chester.autoscooter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Setup stuff
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




    }

    fun requestButtonClicked(fromLocation : String, toLocation : String) {
        val intent = Intent(this, DuringActivity::class.java)
            .putExtra("from_location", fromLocation)
            .putExtra("to_location", toLocation)

        startActivity(intent)
    }
}