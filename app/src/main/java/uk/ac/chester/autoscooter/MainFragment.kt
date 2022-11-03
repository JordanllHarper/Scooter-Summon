package uk.ac.chester.autoscooter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import uk.ac.chester.autoscooter.databinding.ActivityMainBinding
import uk.ac.chester.autoscooter.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    val fromLocation = "current"
    val toLocation = ""
    private lateinit var binding : FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)


    }




}