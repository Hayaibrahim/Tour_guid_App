package com.example.enghaya.pro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class university extends Fragment {
    public static final String NAME = "Hotels";

    public university() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.fragment_university, container, false);

        ArrayList<information> info = new ArrayList<>();
        info.add(new information(getString(R.string.unversityname), "", getString(R.string.unversityaddress)));
        info.add(new information(getString(R.string.unversityname), "", getString(R.string.supermarketlocation2)));
        ListView listView = (ListView) View.findViewById(R.id.unversityid);
        InformationAdapter adapter = new InformationAdapter(View.getContext(), info);
        listView.setAdapter(adapter);

        return View;
    }
}