package com.a634895.mapy;


import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ImagePagerAdapter extends PagerAdapter{
	
	Activity activity;
	int image[];
	String[] stringPodpis;

	public ImagePagerAdapter(Activity act, int[] obrazy, String[] podpis) {
	    image = obrazy;
	    activity = act;
	    stringPodpis = podpis;
	    }

	public int getCount() {
	    return image.length;}

	public Object instantiateItem(View collection, int position) {
	    LayoutInflater inflater = (LayoutInflater)collection.getContext
	                 ().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View layout = inflater.inflate(R.layout.zdjecia_pager_view, null);   

	    ImageView im=(ImageView) layout.findViewById(R.id.zdjecie);             
	    im.setImageResource(image[position]);
	    
	    TextView txt=(TextView) layout.findViewById(R.id.podpis);
	    ((ViewPager) collection).addView(layout, 0);
	    txt.setText(stringPodpis[position]);
	    
	    return layout;   }

	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
	    ((ViewPager) arg0).removeView((View) arg2);
	            }

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
	    return arg0 == ((View) arg1);
	                      }

	@Override
	public Parcelable saveState() {
	    return null;
	              } 

}
