package uk.ac.chester.autoscooter

import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.Context
import android.content.Intent
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.view.children
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import uk.ac.chester.autoscooter.databinding.ActivityMainBinding
import com.google.android.gms.maps.model.LatLng

import com.google.android.gms.maps.CameraUpdateFactory


class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityMainBinding

    private lateinit var map: GoogleMap
    private lateinit var mapView: MapView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Setup stuff
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root



        mapView = binding.mapView
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)


        setContentView(view)

        mapView.onResume()

        binding.rqButton.setOnClickListener {
            requestButtonClicked(
                binding.fromTextbox.text.toString(),
                binding.toTextbox.text.toString()
            )
        }

        binding.imageButton2.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }


    }

    private fun requestButtonClicked(
        fromLocation: String = "current",
        toLocation: String,
    ) {
        val intent = Intent(this, DuringActivity::class.java)
            .putExtra("from_location", fromLocation)
            .putExtra("to_location", toLocation)

        startActivity(intent)
        finish()
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0
        map.uiSettings.isMyLocationButtonEnabled = true
//53.19969893640232,-2.8991836309432983), zoom=15.999067
        map.moveCamera(CameraUpdateFactory.newLatLng(LatLng(53.20066146975975, -2.900170128943804)))
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(53.20066146975975, -2.900170128943804),
           15.999067F
       ))
        var mapViewLocation = map.setOnMapClickListener {
            Log.d("Camera" ,map.cameraPosition.toString())
        }




    }


    override fun onResume() {
        mapView.onResume()
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }



}