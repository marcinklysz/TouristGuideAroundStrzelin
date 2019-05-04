package com.a634895.mapy;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class InformacjeOgolne extends Activity {
	
	WebView InformacjeOgolne;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.informacjeogolne);
	    
	    WebView InformacjeOgolne = (WebView) findViewById(R.id.informacjeogolne);
	    InformacjeOgolne.loadUrl("file:///android_asset/InformacjeOgolne.html");
	    
	    InformacjeOgolne.getSettings().setBuiltInZoomControls(true);
	   
	    // TODO Auto-generated method stub
	}

}
