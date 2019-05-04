package com.a634895.mapy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class Zdjecia extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.zdjecia);
	    
	    ImagePagerAdapter adapter = new ImagePagerAdapter(this, obrazy, podpisy);
	    ViewPager myPager = (ViewPager) findViewById(R.id.myimagepager);
	    myPager.setAdapter(adapter);
	    myPager.setCurrentItem(0);}

	private int obrazy[] = { R.drawable.rotunda, R.drawable.baszta, R.drawable.kaplica, 
			R.drawable.kapliczka, R.drawable.kosciolnmp2, R.drawable.kosciolnmp,
			R.drawable.kosciolsk, R.drawable.kosciolsk2, R.drawable.kosciolsk3, R.drawable.domkb,
			R.drawable.domkb2, R.drawable.ratusz, R.drawable.ratusz2, R.drawable.ratusz3, R.drawable.mapa,
			R.drawable.rynek,R.drawable.poczta,R.drawable.pomnik}; 
	
	private String[] podpisy = new String[] {"Rotunda �w Gotarda","Baszta Prochowa stan obecny",
			"Kaplica szpitalna �w Jerzego, stan obecny","Kaplica szpitalna �w Jerzego, dawniej",
			"Ko�ci� pw. Naj�wi�tszej Marii Panny, dawniej","Ko�ci� pw. Naj�wi�tszej Marii Panny, stan obecny",
			"Ko�ci� pw. �w Krzy�a, stan obecny","Ogr�d przy ko�ciele �w Krzy�a","Ko�ci� pw. �w Krzy�a",
			"Dom Ksi���t Brzeskich, stan obecny","Dom Ksi���t Brzeskich, rok 1945","Ratusz, stan obecny",
			"Ratusz przed II wojn� �wiatow�","Rynek przed II wojn� �wiatow�","�redniowieczny plan miasta",
			"Widok na rynek przed II wojn� �wiatow�","Budynek poczty przed II wojn� �wiatow�","Pomnik strzelca przed II wojn� �wiatow�"}; 
	
	    // TODO Auto-generated method stub
	}


