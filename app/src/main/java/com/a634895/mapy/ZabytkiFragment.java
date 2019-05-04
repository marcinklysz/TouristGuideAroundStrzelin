package com.a634895.mapy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class ZabytkiFragment extends Fragment {
 
    WebView browser;
    String url;
    
  
    @Override
    public View onCreateView(LayoutInflater inflater,
         ViewGroup container, Bundle savedInstanceState) {
 
    	
        View view=inflater.inflate(
            R.layout.zabytki_fragment,
            container,
            false);
   
        browser=(WebView)view.findViewById(R.id.my_browser);
        //browser.setWebViewClient(new WebViewClient());        
        browser.loadUrl(url);        
        browser.getSettings().setBuiltInZoomControls(true);
        return view;
    }
  
    // This is the method the pager adapter will use
    // to create a new fragment
    public static ZabytkiFragment newInstance(String url){
        ZabytkiFragment f=new ZabytkiFragment();
        f.url=url;
        return f;
    }
  
}