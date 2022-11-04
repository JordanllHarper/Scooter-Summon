package uk.ac.chester.autoscooter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.ac.chester.autoscooter.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        supportActionBar?.title = "Journey complete"


        binding.completeJourneyButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}