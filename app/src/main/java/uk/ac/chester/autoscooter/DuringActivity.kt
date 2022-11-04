package uk.ac.chester.autoscooter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.ac.chester.autoscooter.databinding.ActivityDuringBinding

class DuringActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDuringBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityDuringBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.title = "On route"
        binding.cancelButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.qrCodeImage.setOnClickListener {
            val intent = Intent(this, FinishActivity::class.java)
            startActivity(intent)
            finish()
        }




    }
}