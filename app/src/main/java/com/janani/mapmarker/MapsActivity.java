package com.janani.mapmarker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.janani.mapmarker.model.Feed;
import com.janani.mapmarker.model.ReadApiModel;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    //json parsing setup
    private AsyncHttpClient mClient;
    private String mResponseStr;
    private Gson mGson;
    private static final String baseurl = "https://api.thingspeak.com/channels/439272/feeds.json?api_key=301VA4QRMTXFRC24";
    private static final String TAG = "MapsActivity";
    private ReadApiModel ResponseObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mClient = new AsyncHttpClient();
        mClient.get(this, baseurl, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                mResponseStr = new String(responseBody);
                Log.d(TAG, mResponseStr);
                mGson = new Gson();
                ResponseObject = mGson.fromJson(mResponseStr, ReadApiModel.class);
                for (Feed resobject: ResponseObject.getFeeds()) {
                    final Double lat = Double.parseDouble(resobject.getField1());
                    final Double longitude = Double.parseDouble(resobject.getField2());
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(lat, longitude))
                            .title(""));

                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
