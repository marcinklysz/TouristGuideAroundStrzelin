package com.a634895.mapy;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); //usuniecie naglowka
		setContentView(R.layout.activity_main); //przypisanie layoutu do aktywnosci
		
		 final Button click=(Button)findViewById(R.id.btnhistoriamiasta);        //oczekiwanie klikniecia
         click.setOnClickListener(new View.OnClickListener() 
         {                                             
                      public void onClick(View v) 
                        {              
                    	  Intent launchactivity= new Intent(MainActivity.this,InformacjeOgolne.class);  //aktywnosc ktora ma byc uruchomiona po kliknieciu                             
                    	  startActivity(launchactivity);                           
                        }
         });      
         
         final Button click2=(Button)findViewById(R.id.btnzabytki);        
         click2.setOnClickListener(new View.OnClickListener() 
         {                                             
                      public void onClick(View v) 
                        {              
                    	  Intent launchactivity= new Intent(MainActivity.this,ZabytkiMenu.class);                               
                    	  startActivity(launchactivity);                           
                        }
         });
         
         final Button click3=(Button)findViewById(R.id.btnzdjecia);        
         click3.setOnClickListener(new View.OnClickListener() 
         {                                             
                      public void onClick(View v) 
                        {              
                    	  Intent launchactivity= new Intent(MainActivity.this,Zdjecia.class);                               
                    	  startActivity(launchactivity);                           
                        }
         });
         
         final Button click4=(Button)findViewById(R.id.btnszlakhistoryczny);        
         click4.setOnClickListener(new View.OnClickListener() 
         {                                             
                      public void onClick(View v) 
                        {              
                    	  Intent launchactivity= new Intent(MainActivity.this,Mapa.class);                               
                    	  startActivity(launchactivity);                           
                        }
         });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
