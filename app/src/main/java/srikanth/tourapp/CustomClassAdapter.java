package srikanth.tourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class CustomClassAdapter extends ArrayAdapter<Location> {

    public CustomClassAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        Location loc = getItem(position);
        TextView tv1= (TextView) convertView.findViewById(R.id.txt_list);
        tv1.setText(loc.getLocation());
        ImageView iv1= (ImageView) convertView.findViewById(R.id.img_list);
        iv1.setImageResource(loc.getImg());

        return convertView;
    }

}
