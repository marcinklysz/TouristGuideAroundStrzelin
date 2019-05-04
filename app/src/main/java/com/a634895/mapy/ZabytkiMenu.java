package com.a634895.mapy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;

public class ZabytkiMenu extends FragmentActivity {
	
	static int strona;   
	   public static int przenosizmienna2(){
		    return strona;
		}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.zabytki_menu);       
          
	     
	    
	    // TODO Auto-generated method stub
	}
	
	
	
	public void onClick_domury(View v) {
		strona = 0;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_dorotunda(View v) {
		strona = 1;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_dobaszta(View v) {
		strona = 2;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_dokaplica(View v) {
		strona = 3;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_dokosciolnmp(View v) {
		strona = 4;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_doklasztorboromeuszek(View v) {
		strona = 5;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
	public void onClick_dokosciolsk(View v) {
		strona = 6;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}
    public void onClick_dodomkb(View v) {
    	strona = 7;    	
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);                  
    	startActivity(launchactivity);     	
	}
    public void onClick_doratusz(View v) {
		strona = 8;
    	Intent launchactivity = new Intent(ZabytkiMenu.this,ZabytkiPagerView.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
  	  startActivity(launchactivity);     
	}

}
