package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;

import org.osmdroid.config.Configuration;
import org.osmdroid.events.MapEventsReceiver;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.MapEventsOverlay;
import org.osmdroid.views.overlay.Marker;

public class Outlets extends AppCompatActivity implements MapEventsReceiver {
    private final int REQUEST_PERMISSION_REQUEST_CODE = 1;
    private MapView map = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outlets);
        Context ctx = getApplicationContext();
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));
        map = (MapView) findViewById(R.id.map);
        MapEventsOverlay mapEventsOverlay = new MapEventsOverlay(this, this);
        map.getOverlays().add(0, mapEventsOverlay);
        map.setTileSource(TileSourceFactory.MAPNIK);
        GeoPoint Outlet_A = new GeoPoint(-6.915845285206341, 107.58613438261567);
        GeoPoint Outlet_B = new GeoPoint(-6.916319633556482,107.59370478791487);
        GeoPoint Outlet_C = new GeoPoint(-6.912804868628957, 107.59174141113208);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(Outlet_A);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        startMarker.setTitle("OUTLET A");

        Marker midMarker = new Marker(map);
        midMarker.setPosition(Outlet_B);
        midMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        midMarker.setTitle("OUTLET B");

        Marker endMarker = new Marker(map);
        endMarker.setPosition(Outlet_C);
        endMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        endMarker.setTitle("OUTLET C");

        map.getController().setCenter(Outlet_A);
        map.getController().setZoom(10);
        map.getOverlays().add(startMarker);
        map.getOverlays().add(midMarker);
        map.getOverlays().add(endMarker);
        map.invalidate();
    }

    @Override
    public boolean singleTapConfirmedHelper(GeoPoint p) {
        return false;
    }

    @Override
    public boolean longPressHelper(GeoPoint p) {
        return false;
    }
}