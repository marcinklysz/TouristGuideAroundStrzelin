package com.a634895.mapy;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Mapa extends FragmentActivity {
	
	static String opis;
	public static String przenosizmienna(){
	    return opis;
	}
		
	private final LatLng location_strzelin = new LatLng(50.780980091949736, 17.070339918136597);
	private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mapa);
		
		// Getting Google Play availability status
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());
 
        // Showing status
        if(status!=ConnectionResult.SUCCESS){ // Google Play Services are not available
            int requestCode = 10;
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, this, requestCode);
            dialog.show();
 
        }else {    // Google Play Services are available
						
		map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(location_strzelin, 14);
		map.animateCamera(update);		
		
		map.addPolyline(new PolylineOptions()
        .add(new LatLng(50.78399738366601, 17.061579823493958))  // PKS
        .add(new LatLng(50.784092349218895, 17.062159180641174))  // 2
        .add(new LatLng(50.784255146860765, 17.06272780895233))  // 3
        .add(new LatLng(50.78305450092656, 17.065367102622986))  // 4 TESCO
        .add(new LatLng(50.7823083212525, 17.067877650260925))  // 5 poczta
        .add(new LatLng(50.782789947677344, 17.068381905555725))  // 6 mor
        .add(new LatLng(50.78290526594438,17.06904709339142 ))  // ogolniak boisko
        .add(new LatLng(50.78290526594438,17.071385979652405 ))  // pomnik jp2
        .add(new LatLng(50.78274246360238,17.071343064308167 ))  // 9
        .add(new LatLng(50.782647495307785, 17.07349956035614))  // sala technikum
        .add(new LatLng(50.78147394260602, 17.073445916175842))  // rotunda
        .add(new LatLng(50.78141288992536, 17.073649764060974))  // rotunda2
        .add(new LatLng(50.78024609004298, 17.07354247570038))  // 13
        .add(new LatLng(50.78013076521779, 17.074679732322693))  // komal
        .add(new LatLng(50.779432026371495, 17.074432969093323))  // baszta
        .add(new LatLng(50.77925564404146, 17.0725017786026))  // meblowy
        .add(new LatLng(50.77861116448691, 17.072705626487732))  // 17
        .add(new LatLng(50.777382558342076, 17.072579562664032))  // skrzyzowanie WP
        .add(new LatLng(50.77719599191208, 17.07234889268875))  // skrzyzowanie 2
        .add(new LatLng(50.777063698901635, 17.072268426418304))  // 20
        .add(new LatLng(50.776697347073515, 17.07190364599228))  // hurtownia owocow
        .add(new LatLng(50.77652095442907, 17.071807086467743))  // 22
        .add(new LatLng(50.77596802702078, 17.071978747844696))  // 23
        .add(new LatLng(50.77467218380209, 17.07267075777054))  // kosciol sw jana
        .add(new LatLng(50.77437705218558, 17.071324288845062))  // maria1
        .add(new LatLng(50.77480109128014, 17.07115262746811))  // maria2
        .add(new LatLng(50.77503142771017, 17.071119099855423))  // maria3
        .add(new LatLng(50.77554874765179, 17.070869654417038))  // maria4
        .add(new LatLng(50.776156633676656, 17.070642337203026))  // maria5
        .add(new LatLng(50.77655623301636, 17.070008665323257))  // maria6
        .add(new LatLng(50.77696498772446, 17.069107443094254))  // park1
        .add(new LatLng(50.77686491947471, 17.068876773118973))  // park rondo
        .add(new LatLng(50.77812203250692, 17.068561613559723))  // most
        .add(new LatLng(50.778542645622274, 17.0688459277153))  // most2
        .add(new LatLng(50.778678326465396, 17.06942528486252))  // wp
        .add(new LatLng(50.778437492698124, 17.069763243198395))  // krucza
        .add(new LatLng(50.7783628678988, 17.071699798107147))  // krucza2
        .add(new LatLng(50.778691894528066, 17.07260638475418))  // powrot
        .add(new LatLng(50.779241397757644, 17.07241326570511))  // powrot2
        .add(new LatLng(50.77923122183059, 17.072246968746185))  // lawki
        .add(new LatLng(50.779658608860366, 17.071935832500458))  // piekarnia
        .add(new LatLng(50.77947883542698, 17.07090586423874))  // silownia
        .add(new LatLng(50.77951953890637, 17.070069015026093))  // vet
        .add(new LatLng(50.78035395242656, 17.070079743862152))  // domkb
        .add(new LatLng(50.78044553349154, 17.070315778255463))  // rynek
        .add(new LatLng(50.78085934199338, 17.07036942243576))  // 46 META        
        .color(Color.RED)
        .width(5)
        //.geodesic(true)
		);
		
		//m0
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.78399738366601, 17.061579823493958))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.start2))
				.anchor(0.5f, 0.5f)
				.title("START"));
		
		//m1
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.780859681199885, 17.07037143409252))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.meta2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Ratusz"));
		
		//m2
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.78255388370064, 17.0682156085968))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Mury obronne"));
		
		//m3
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.78135794250674, 17.073480784893036))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Rotunda Œw Gotarda"));
				
		//m4
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.779716271942455, 17.074462473392487))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Baszta prochowa"));		
				
		//m5
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.77932280514613, 17.073427140712738))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Kaplica Œw Jerzego"));
		
		//m6
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.774909644722065, 17.07259565591812))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Koœció³ Najœwiêtszej Marii Panny"));	
				
		//m7
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.779756975215214, 17.06991881132126))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Klasztor Boromeuszek"));
				
		//m8
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.77999101834591, 17.069763243198395))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Koœciol Œwiêtego Krzy¿a"));
				
		//m9
				map.addMarker(new MarkerOptions()
				.position(new LatLng(50.780275938837036, 17.069929540157318))
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.punkt2))
				.snippet("Zobacz opis")
				.anchor(0.5f, 0.5f)
				.title("Dom Ksi¹¿¹t Brzeskich"));
				
		map.setMyLocationEnabled(true);
				
		map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
				   
					@Override				 
				   public void onInfoWindowClick(Marker marker) {
				 						
						if(marker.getId().equals("m1")){		//porownanie zawartosci stringa
							opis = "file:///android_asset/ratusz.html";
							   OtwieraDialog();
							}
						if(marker.getId().equals("m2")){
							opis = "file:///android_asset/mury.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m3")){
							opis = "file:///android_asset/rotunda.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m4")){
							opis = "file:///android_asset/baszta.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m5")){
							opis = "file:///android_asset/kaplica.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m6")){
							opis = "file:///android_asset/kosciolnmp.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m7")){
							opis = "file:///android_asset/klasztorboromeuszek.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m8")){
							opis = "file:///android_asset/kosciolsk.html";
							   OtwieraDialog();				
							  }
						if(marker.getId().equals("m9")){
							opis = "file:///android_asset/domkb.html";
							   OtwieraDialog();				
							  }				    
				   }
				 
				  });
		
		
	}	//warunek Google Play Services available        
    }  //onCreate
	
	void OtwieraDialog(){
	    
	     OpisClass DialogZOpisem = OpisClass.newInstance();
	     DialogZOpisem.show(getFragmentManager(),"OpisClass");
	     
	    }
	
	private void removeProximityAlert() {

		String context = Context.LOCATION_SERVICE;
		LocationManager locationManager = (LocationManager) getSystemService(context);

		Intent a = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation = PendingIntent.getBroadcast(getApplicationContext(), 10800000, a, 0);
		locationManager.removeProximityAlert(operation);
		
		Intent b = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation2 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , b, 1);
		locationManager.removeProximityAlert(operation2);
		
		Intent c = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation3 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , c, 2);
		locationManager.removeProximityAlert(operation3);
		
		Intent d = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation4 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , d, 3);
		locationManager.removeProximityAlert(operation4);
		
		Intent e = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation5 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , e, 4);
		locationManager.removeProximityAlert(operation5);
		
		Intent f = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation6 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , f, 5);
		locationManager.removeProximityAlert(operation6);
		
		Intent g = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation7 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , g, 6);
		locationManager.removeProximityAlert(operation7);
		
		Intent h = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation8 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , h, 7);
		locationManager.removeProximityAlert(operation8);
		
		Intent i = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation9 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , i, 8);
		locationManager.removeProximityAlert(operation9);
		
		//testowy do usuniecia
		Intent j = new Intent("com.a634895.proximityalert"); 
		PendingIntent operation10 = PendingIntent.getBroadcast(getApplicationContext(), 10800000 , j, 9);
		locationManager.removeProximityAlert(operation10);
		}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/
	public void onClick_Wlacz(View v) {
		
		LocationManager locmanager;
		float radius=50;                //odleg³osc alertu w metrach
		
		IntentFilter filter = new IntentFilter("com.a634895.proximityalert");
	    registerReceiver(new ProximityAlert(), filter);
	    locmanager=(LocationManager) getSystemService(LOCATION_SERVICE);
	    
	//mury obronne	 
	     Intent a = new Intent("com.a634895.proximityalert");           //Custom Action
	     PendingIntent pimury = PendingIntent.getBroadcast(getApplicationContext(), 10800000, a, 0); //-1 nie wy³¹cza siê, 10 800 000 to 3h
	     locmanager.addProximityAlert(50.78255388370064, 17.0682156085968, radius, 10800000, pimury);
	          
	//rotunda gotarda
	     Intent b= new Intent("com.a634895.proximityalert");           
	     PendingIntent pirotunda = PendingIntent.getBroadcast(getApplicationContext(), 10800000, b, 1);
	     locmanager.addProximityAlert(50.78135794250674, 17.073480784893036, radius, 10800000, pirotunda);

    //baszta prochowa
	     Intent c= new Intent("com.a634895.proximityalert");           
	     PendingIntent pibaszta = PendingIntent.getBroadcast(getApplicationContext(), 10800000, c, 2);
	     locmanager.addProximityAlert(50.779716271942455, 17.074462473392487, radius, 10800000, pibaszta);

	//kaplica Sw Jerzego
	  	 Intent d= new Intent("com.a634895.proximityalert");           
	  	 PendingIntent pikaplicaswjerzego = PendingIntent.getBroadcast(getApplicationContext(), 10800000, d, 3);
	  	 locmanager.addProximityAlert(50.77932280514613, 17.073427140712738, radius, 10800000, pikaplicaswjerzego);

	//kosciol nmp
	     Intent e= new Intent("com.a634895.proximityalert");           
	     PendingIntent pikosciolnmp = PendingIntent.getBroadcast(getApplicationContext(), 10800000, e, 4);
	     locmanager.addProximityAlert(50.774909644722065, 17.07259565591812, radius, 10800000, pikosciolnmp);
	  		 
    //klasztor boromeuszek
	     Intent f= new Intent("com.a634895.proximityalert");           
	     PendingIntent piklasztorboromeuszek = PendingIntent.getBroadcast(getApplicationContext(), 10800000, f, 5);
	     locmanager.addProximityAlert(50.779756975215214, 17.06991881132126, radius, 10800000, piklasztorboromeuszek);
	  
   //kosciol sk
	     Intent g= new Intent("com.a634895.proximityalert");           
	     PendingIntent pikosciolsk = PendingIntent.getBroadcast(getApplicationContext(), 10800000, g, 6);
	     locmanager.addProximityAlert(50.77999101834591, 17.069763243198395, radius, 10800000, pikosciolsk);
	  		 
   //dom ksiazat brzeskich
	     Intent h= new Intent("com.a634895.proximityalert");           
	     PendingIntent pidomkb = PendingIntent.getBroadcast(getApplicationContext(), 10800000, h, 7);
	     locmanager.addProximityAlert(50.780275938837036, 17.069929540157318, radius, 10800000, pidomkb);
	  		 
   //ratusz
	     Intent i= new Intent("com.a634895.proximityalert");           
	     PendingIntent piratusz = PendingIntent.getBroadcast(getApplicationContext(), 10800000, i, 8);
	     locmanager.addProximityAlert(50.780859681199885, 17.07037143409252, radius, 10800000, piratusz);
	  		 
//testowy do usuniecia
	     Intent j= new Intent("com.a634895.proximityalert");           
	     PendingIntent pitest = PendingIntent.getBroadcast(getApplicationContext(), 10800000, j, 9);
	     locmanager.addProximityAlert(50.758599387551484, 16.911145448684692, radius, 10800000, pitest);
	  		 
	//info   
	     Toast toast = Toast.makeText(this, "Sygnalizacja zbli¿ania siê do zabytku w³¹czona", Toast.LENGTH_LONG);
	     toast.setGravity(Gravity.CENTER, 0, 0);
	     toast.show();
		
	}
	public void onClick_Wylacz(View v) {
		
		removeProximityAlert();
		Toast toast = Toast.makeText(this, "Sygnalizacja zbli¿ania siê do zabytku wy³¹czona", Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 0, 0);
	    toast.show();
	}
	
	public void onClick_Info(View v) {
		opis = "file:///android_asset/mapainfo.html";
		OtwieraDialog();
	
	}

}
