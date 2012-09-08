package mx.raku.galaendeavor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class ProductScreen extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pager);

		ComplexAdapter adapter = new ComplexAdapter();
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);

//		GridView gridView = (GridView) findViewById(R.id.gridview);
//		gridView.setAdapter(new ImageAdapter(this));
//
//		gridView.setOnItemClickListener(new OnItemClickListener() {
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				Toast.makeText(getApplicationContext(), "" + position,
//						Toast.LENGTH_SHORT).show();
//
//			}
//		});
//
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.first_product_screen_menu, menu);
		return true;
	}

}
