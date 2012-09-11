package mx.raku.galaendeavor.adapter;

import java.util.List;

import mx.raku.galaendeavor.fragments.FirstProductScreen;
import mx.raku.galaendeavor.fragments.SecondProductScreen;
import mx.raku.galaendeavor.fragments.ThirdProductFragment;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.View;

public class ComplexPagerViewAdapter extends FragmentPagerAdapter {

	private List<Fragment> fragments;

	public ComplexPagerViewAdapter(FragmentActivity activity,
			List<Fragment> fragments) {
		super(activity.getSupportFragmentManager());
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int i) {
		return fragments.get(i);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	// @Override
	// public Fragment getItem(int page) {
	// switch (page) {
	// case 0:
	// Log.e("***", "It works first");
	// return FirstProductScreen.newInstance("Screen");
	//
	// case 1:
	// Log.e("***", "It works second");
	// return SecondProductScreen.newInstance("Yay!");
	//
	// case 2:
	// Log.e("***", "It works third");
	// return ThirdProductFragment.newInstance("OSOM");
	// }
	// return null;
	// }

}
