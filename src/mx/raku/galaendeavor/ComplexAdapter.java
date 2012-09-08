package mx.raku.galaendeavor;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ComplexAdapter extends PagerAdapter {

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		LayoutInflater inflater = (LayoutInflater) container.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		int resId = 0;
		switch (position) {
		case 0:
			resId = R.layout.first_product_screen;
			Log.e("***", "first screen");

			break;
		case 1:
			resId = R.layout.second_product_screen;
			Log.e("***", "2nd screen");
			break;
		case 2:
			resId = R.layout.third_product_screen;
			Log.e("***", "3rd screen");
			break;
		}
		View view = inflater.inflate(resId, null);
		((ViewPager) container).addView(view, 0);

		return view;

	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((View) object);
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		((ViewPager) container).removeView((View) object);
	}

}
