package mx.raku.galaendeavor.fragments;

import mx.raku.galaendeavor.R;
import mx.raku.galaendeavor.adapter.ImageAdapter;
import mx.raku.galaendeavor.ui.ProductDetail;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class FirstProductScreen extends Fragment {
	GridView gridView;

	public static FirstProductScreen newInstance(String title) {
		FirstProductScreen first = new FirstProductScreen();
		Bundle bundle = new Bundle();
		bundle.putString("title", title);
		first.setArguments(bundle);
		return first;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View myFragmentView = inflater.inflate(R.layout.first_product_fragment,
				container, false);
		gridView = (GridView) myFragmentView.findViewById(R.id.gridview);
		gridView.setAdapter(new ImageAdapter(getActivity()));
		gridView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Intent intent = new Intent(getActivity(), ProductDetail.class);
				startActivity(intent);				
			}
			
		});

		return myFragmentView;
	}

}