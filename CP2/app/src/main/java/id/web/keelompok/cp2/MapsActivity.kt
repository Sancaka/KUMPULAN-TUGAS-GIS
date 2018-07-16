package id.web.keelompok.cp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val context = this
        var db = DatabaseAccess(context)
        var data = db.quotes
        for (i in 0..(data.size - 1)) {
            mMap = googleMap

            // Add a marker in Sydney and move the camera
            val sydney = LatLng(data[i].LONGTITUDE.toString().toDouble(),data[i].LATITUDE.toString().toDouble())
            mMap.addMarker(MarkerOptions().position(sydney).title(data[i].LONGTITUDE.toString()))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        }

    }
}
