package com.a634895.mapy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

public class OpisClass extends DialogFragment{
	
	String opis = Mapa.przenosizmienna();
	
	static OpisClass newInstance() {
	 
	        OpisClass f = new OpisClass();
	        Bundle args = new Bundle();	   
	        f.setArguments(args);
	        return f;
	    }


	 @Override
	 public Dialog onCreateDialog(Bundle savedInstanceState) {	  
		 AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
		 .setPositiveButton("Kontynuuj", new DialogInterface.OnClickListener() {
			        
			        @Override
			        public void onClick(DialogInterface dialog, int which) {
			        }
			       });
			      
		    LayoutInflater inflater = LayoutInflater.from(getActivity());
		    View WV = inflater.inflate(R.layout.opisclasslayout, null);
		    WebView web = (WebView) WV.findViewById(R.id.web);		    
		    web.loadUrl(opis);
		    builder.setView(WV);

		    return builder.create();
	   
	 }
	 
	}