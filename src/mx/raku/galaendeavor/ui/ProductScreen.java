package mx.raku.galaendeavor.ui;

import java.util.ArrayList;
import java.util.List;

import mx.raku.galaendeavor.R;
import mx.raku.galaendeavor.R.id;
import mx.raku.galaendeavor.R.layout;
import mx.raku.galaendeavor.R.menu;
import mx.raku.galaendeavor.adapter.ComplexPagerViewAdapter;
import mx.raku.galaendeavor.fragments.FirstProductScreen;
import mx.raku.galaendeavor.fragments.SecondProductScreen;
import mx.raku.galaendeavor.fragments.ThirdProductFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class ProductScreen extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pager);

		ComplexPagerViewAdapter adapter = new ComplexPagerViewAdapter(this,
				createFragments());
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);

	}

	private List<Fragment> createFragments() {
		List<Fragment> list = new ArrayList<Fragment>();
		list.add(Fragment.instantiate(this, FirstProductScreen.class.getName()));
		list.add(Fragment.instantiate(this, SecondProductScreen.class.getName()));
		list.add(Fragment.instantiate(this,
				ThirdProductFragment.class.getName()));
		return list;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.first_product_screen_menu, menu);
		return true;
	}

}
