package com.example.enghaya.pro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class coffeeshop extends Fragment {
    public coffeeshop() {
    }

    public static final String NAME = "coffeeshop";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.fragment_coffeeshop, container, false);

        ArrayList<information> info = new ArrayList<>();
        info.add(new information(getString(R.string.coffeeshopname), "", getString(R.string.coffeeshoplocation), R.drawable.de));
        info.add(new information(getString(R.string.coffeeshopname1), "", getString(R.string.coffeeshoplocation1), R.drawable.download));

        ListView listView = (ListView) View.findViewById(R.id.coffeeshopid);
        InformationAdapter adapter = new InformationAdapter(View.getContext(), info);
        listView.setAdapter(adapter);
        return View;
    }

}