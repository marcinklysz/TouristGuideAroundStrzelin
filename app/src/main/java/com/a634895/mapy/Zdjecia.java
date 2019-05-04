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
	
	private String[] podpisy = new String[] {"Rotunda Œw Gotarda","Baszta Prochowa stan obecny",
			"Kaplica szpitalna Œw Jerzego, stan obecny","Kaplica szpitalna Œw Jerzego, dawniej",
			"Koœció³ pw. Najœwiêtszej Marii Panny, dawniej","Koœció³ pw. Najœwiêtszej Marii Panny, stan obecny",
			"Koœció³ pw. Œw Krzy¿a, stan obecny","Ogród przy koœciele Œw Krzy¿a","Koœció³ pw. Œw Krzy¿a",
			"Dom Ksi¹¿¹t Brzeskich, stan obecny","Dom Ksi¹¿¹t Brzeskich, rok 1945","Ratusz, stan obecny",
			"Ratusz przed II wojn¹ œwiatow¹","Rynek przed II wojn¹ œwiatow¹","Œredniowieczny plan miasta",
			"Widok na rynek przed II wojn¹ œwiatow¹","Budynek poczty przed II wojn¹ œwiatow¹","Pomnik strzelca przed II wojn¹ œwiatow¹"}; 
	
	    // TODO Auto-generated method stub
	}


