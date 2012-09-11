package mx.raku.galaendeavor.adapter;

import mx.raku.galaendeavor.R;
import mx.raku.galaendeavor.R.drawable;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;

	
	public ImageAdapter(Context context) {
		mContext = context;
	}

	public int getCount() {
		return mThumbId.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if(convertView == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85,85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		}
		else{
			imageView = (ImageView) convertView;
		}
			imageView.setImageResource(mThumbId[position]);
			
		return null;
	}
	
	// references to our images
    private Integer[] mThumbId = {
            R.drawable.logo_gala_endeavor_low,
    };

	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void registerDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	public void unregisterDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}

}
