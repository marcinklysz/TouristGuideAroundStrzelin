package com.a634895.mapy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.view.Gravity;
import android.widget.Toast;

public class ProximityAlert extends BroadcastReceiver{

@Override
public void onReceive(Context arg0, Intent arg1) {
// TODO Auto-generated method stub
// The reciever gets the Context & the Intent that fired the broadcast as arg0 & agr1 
String k=LocationManager.KEY_PROXIMITY_ENTERING;
// Key for determining whether user is leaving or entering 
boolean state=arg1.getBooleanExtra(k, false);

if(state){  //jezeli wchodzi
	

	Vibrator v = (Vibrator) arg0.getSystemService(Context.VIBRATOR_SERVICE);		 
	v.vibrate(900);  //czas wibrowania w milisek
	
	Toast toast = Toast.makeText(arg0, "W promieniu 50 metrów znajduje siê zabytek", Toast.LENGTH_LONG);
	toast.setGravity(Gravity.CENTER, 0, 0);
	toast.show();
	
	/*
	// custom dialog
				final Dialog dialog = new Dialog(arg0);
				dialog.setContentView(R.layout.custom_dialog);
				dialog.setTitle("Title...");
	 
				// set the custom dialog components - text, image and button
				TextView text = (TextView) dialog.findViewById(R.id.text);
				text.setText("Android custom dialog example!");
				//ImageView image = (ImageView) dialog.findViewById(R.id.image);
				//image.setImageResource(R.drawable.ic_launcher);
				dialog.show();
	*/
	try {
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone r = RingtoneManager.getRingtone(arg0, notification);
        r.play();
    } catch (Exception e) {}
}
//else{
//Other custom Notification 
//Toast.makeText(arg0, "Thank you for visiting my Area,come back again !!", 800).show();	
//}
}
	
}

