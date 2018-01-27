package com.example.android.travlebd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class SyletFragment extends Fragment {


    public SyletFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list , container,false);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Keane Bridge" ,
                "21/c Puranlane Dhaka - Sylhet Hwy, Sylhet"));
        words.add(new Word("Dreamland Amusement & Water Park" ,
                " Dreamland Park Rd"));
        words.add(new Word("The Central Muslim Sahitya Sangsad",
                "Sylhet"));
        words.add(new Word("Zindabazar Point" ,
                "Dhaka - Sylhet Hwy, Sylhet"));
        words.add(new Word("Adventure World Amusement Park" ,
                "Salutikor Rd"));
        words.add(new Word("Tilagor Eco Park, Sylhet" ,
                " Alurtol Road, Sylhet"));


        WordAdapter adapter = new WordAdapter(getContext() , words);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
