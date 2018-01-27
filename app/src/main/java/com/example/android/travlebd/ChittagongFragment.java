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



public class ChittagongFragment extends Fragment {


    public ChittagongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list , container , false);
        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Patenga Beach" ,
                "  14 kilometres south of the port city of Chittagong"));
        words.add(new Word("Zia Memorial Museum" ,
                "Shahid Saifuddin Khaled Rd, Chittagong"));
        words.add(new Word("Ethnological Museum, Chittagong",
                " Sabdar Ali Rd, Chittagong"));
        words.add(new Word("Shrine of Bayazid Bostami" ,
                " Chittagong"));
        words.add(new Word("Chittagong Zoo" ,
                " Foy's Lake Approach Rd., Thana Akbar Shah Police Station,, Chittagong"));
        words.add(new Word("Bangladesh Railway Museum" ,
                "Ambagan Road, Chittagong"));
        words.add(new Word("Pahartali European Club" ,
                "Ambagan Road, Chittagong"));
        words.add(new Word("Foy's Lake Amusement World" ,
                "Foy's Lake Approach Road, Chittagong"));
        words.add(new Word("Masjid-e-Siraj ud-Daulah" ,
                "Shiraj Ud Dowla Road, Chittagong"));
        words.add(new Word("Sunset Point" ,
                "Bhatiari - Hathazari Link Rd, Bhatiari"));



        WordAdapter adapter = new WordAdapter(getActivity() , words);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
