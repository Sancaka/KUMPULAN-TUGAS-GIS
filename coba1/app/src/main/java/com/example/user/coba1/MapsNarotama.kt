package com.example.user.coba1

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsNarotama : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maps_narotama)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val narotama = LatLng(-7.288075, 112.776449)
        mMap!!.addMarker(MarkerOptions().position(narotama).title("Marker in narotama"))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(narotama))
    }
}