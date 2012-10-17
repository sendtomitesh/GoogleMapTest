package com.goolgemaptest;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends MapActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapView mapView = (MapView) findViewById(R.id.mapView);
        LinearLayout zoomLayout = (LinearLayout)findViewById(R.id.zoom);  
        View zoomView = mapView.getZoomControls(); 
 
        zoomLayout.addView(zoomView, 
            new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, 
                LayoutParams.WRAP_CONTENT)); 
        mapView.displayZoomControls(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}
