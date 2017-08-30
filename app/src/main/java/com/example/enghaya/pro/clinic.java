package com.example.enghaya.pro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class clinic extends Fragment {
    public static final String NAME = "clinic";
    public clinic() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.fragment_clinic, container, false);
        ArrayList<information> info = new ArrayList<>();
        info.add(new information(getString(R.string.clinicname), "", getString(R.string.cliniclocation)));
        info.add(new information(getString(R.string.clinicname1), "", getString(R.string.cliniclocation1)));

        ListView listView = (ListView) View.findViewById(R.id.clinicid1);
        adapter adapter = new adapter(View.getContext(), info);
        listView.setAdapter(adapter);
        return View;
    }

}