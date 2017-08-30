package com.example.enghaya.pro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ENG.HAYA on 8/29/2017 AD.
 */

public class InformationAdapter extends ArrayAdapter<information> {
    private Context mContext;

    public InformationAdapter(Context context, ArrayList<information> infor) {
        super(context, 0, infor);
        mContext = context;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {
        // Get the data item for this position
        information info = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (View == null) {
            View = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main, parent, false);
        }

        // Lookup view for data population
        ImageView imageView = (ImageView) View.findViewById(R.id.image);
        TextView titleTextView = (TextView) View.findViewById(R.id.textView);
        TextView descTextView = (TextView) View.findViewById(R.id.textView2);
        TextView locTextView = (TextView) View.findViewById(R.id.textView3);

        // Populate the data into the template view using the data object
        imageView.setImageResource(info.getPic());
        titleTextView.setText(info.getName());
        descTextView.setText(info.getAddress());
        locTextView.setText(info.getLocation());

        // Return the completed view to render on screen
        return View;
    }
}
