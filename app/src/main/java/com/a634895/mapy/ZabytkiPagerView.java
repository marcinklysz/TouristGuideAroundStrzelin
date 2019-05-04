package com.a634895.mapy;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class ZabytkiPagerView extends FragmentActivity {
 
    ViewPager pager;
    FragmentStatePagerAdapter adapter;
    int strona = ZabytkiMenu.przenosizmienna2();
  
    /* Just some random URLs
    *
    * Each page of our pager will display one URL from this array
    * Swiping, to the right will take you to the next page having
    * the next URL.
    */     
     String[] toVisit={
        "file:///android_asset/mury2.html",
    	"file:///android_asset/rotunda2.html",
        "file:///android_asset/baszta2.html",
        "file:///android_asset/kaplica2.html",
        "file:///android_asset/kosciolnmp2.html",
        "file:///android_asset/klasztorboromeuszek2.html",
        "file:///android_asset/kosciolsk2.html",
        "file:///android_asset/domkb2.html",
        "file:///android_asset/ratusz2.html",        
    };
                
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.zabytki_pager_view);
        pager=(ViewPager)findViewById(R.id.my_pager);   
        
         
        adapter=new FragmentStatePagerAdapter(
            getSupportFragmentManager()
            ){
    
            @Override
            public int getCount() {
                // This makes sure getItem doesn't use a position
               // that is out of bounds of our array of URLs
               return toVisit.length;
            }
    
            @Override
            public Fragment getItem(int position) {
            
                // Here is where all the magic of the adapter happens
                // As you can see, this is really simple.
                return ZabytkiFragment.newInstance(toVisit[position]);
            }
            
        };   
        
        //Let the pager know which adapter it is supposed to use
        pager.setAdapter(adapter); 
        pager.setCurrentItem(strona);
    } 
}
