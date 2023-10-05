package com.example.rutasgoogle.Utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

import com.example.rutasgoogle.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkersDefault  {

    GoogleMap nMap;
    Context context;

    public MarkersDefault(GoogleMap nMap, Context context) {
        this.nMap = nMap;
        this.context = context;
    }


    public void addMarkersDefault() {
        uno(20.72560957587309, -103.31085387897318, "punto 1");
        dos(20.70642952048865, -103.32834752047789,"Punto 2");
        tres(20.649212020960846, -103.32144651334609,"Punto 3");
    }

    public void uno(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;

        BitmapDrawable jira = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap ji = jira.getBitmap();
        Bitmap jiras = Bitmap.createScaledBitmap(ji, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("desea ir este punto?")
                .icon(BitmapDescriptorFactory.fromBitmap(jiras))
        );
    }
    public void dos(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;

        BitmapDrawable lo = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap lob = lo.getBitmap();
        Bitmap lod = Bitmap.createScaledBitmap(lob, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo)
                .icon(BitmapDescriptorFactory.fromBitmap(lod))
        );
    }
    public void tres(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;

        BitmapDrawable muse = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap mus = muse.getBitmap();
        Bitmap muss = Bitmap.createScaledBitmap(mus, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo)
                .icon(BitmapDescriptorFactory.fromBitmap(muss))
        );
    }
    public void cuatro(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;

        BitmapDrawable pv = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap pava = pv.getBitmap();
        Bitmap pavas = Bitmap.createScaledBitmap(pava, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo)
                .icon(BitmapDescriptorFactory.fromBitmap(pavas))
        );
    }
    public void cinco(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable jb = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap jarb = jb.getBitmap();
        Bitmap jbs = Bitmap.createScaledBitmap(jarb, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo)
                .icon(BitmapDescriptorFactory.fromBitmap(jbs))
        );
    }
    public void seis(Double latitud, Double longitud, String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;

        BitmapDrawable os = (BitmapDrawable) context.getResources().getDrawable(R.drawable.iconomapas);
        Bitmap oso = os.getBitmap();
        Bitmap osoo= Bitmap.createScaledBitmap(oso, width, height, false);

        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo)
                .icon(BitmapDescriptorFactory.fromBitmap(osoo))
        );
    }




}
