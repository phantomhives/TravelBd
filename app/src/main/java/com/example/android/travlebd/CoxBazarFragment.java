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


public class CoxBazarFragment extends Fragment {

    public CoxBazarFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list , container , false);
        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("St. Martin's Island" ,
                "  Bay of Bengal"));
        words.add(new Word("Himchari National Park" ,
                " Cox's Bazar Marine Drive Road, Cox's Bazar"));
        words.add(new Word("Himchori Waterfall",
                " Marine Dr Himchori, Cox's Bazar"));
        words.add(new Word("Adinath Temple, Maheshkhali" ,
                " New Jetty Rd"));
        words.add(new Word("Sea Inn Beach Point" ,
                "Sea Inn Beach Point, Hotel Motel Zone, Cox's Bazar"));
        words.add(new Word("Himchori View Point" ,
                " Cox's Bazar Marine Dr, Cox's Bazar"));



        WordAdapter adapter = new WordAdapter(getActivity() , words);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
