package mx.raku.galaendeavor.fragments;

import mx.raku.galaendeavor.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondProductScreen extends Fragment {

	public static FirstProductScreen newInstance(String title) {
		FirstProductScreen first = new FirstProductScreen();
		Bundle bundle = new Bundle();
		bundle.putString("title", title);
		first.setArguments(bundle);
		return first;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		return inflater.inflate(R.layout.second_product_fragment, container,
				false);
	}

}
