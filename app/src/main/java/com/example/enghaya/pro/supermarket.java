package com.example.enghaya.pro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class supermarket extends Fragment {
    public static final String NAME = "supermarket";

    public supermarket() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.fragment_supermarket, container, false);

        ArrayList<information> info = new ArrayList<>();
        info.add(new information(getString(R.string.supermarketname), "", getString(R.string.supermarketaddress)));
        info.add(new information(getString(R.string.supermarketname), "", getString(R.string.supermarketlocation)));
        info.add(new information(getString(R.string.supermarketname), "", getString(R.string.supermarketlocation2)));

        ListView listView = (ListView) View.findViewById(R.id.supermarketid);
        InformationAdapter adapter = new InformationAdapter(View.getContext(), info);
        listView.setAdapter(adapter);

        return View;
    }

}