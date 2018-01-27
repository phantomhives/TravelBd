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


public class DhakaFragment extends Fragment {



    public DhakaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.word_list ,container ,false);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Shishu Park" ,
                " 1000, Shahbag Foot Over Bridge, Dhaka"));
        words.add(new Word("Bangladesh National Museum" ,
                "Shahbagh Rd, Dhaka 1000"));
        words.add(new Word("Lalbagh Fort","Lalbagh Rd, Dhaka"));
        words.add(new Word("Ahsan Manzil" , "2/3 Islampur Rd, Dhaka"));
        words.add(new Word("Jatiyo Sriti Shoudho" ,
                "Savar, Bangladesh"));
        words.add(new Word("Sixty Dome Mosque" ,
                " Bagerhat-Khulna Rd, Bagerhat 9300"));
        words.add(new Word("Jatiya Sangsad Bhaban" ,
                "Manik Mia Ave, Dhaka"));
        words.add(new Word("Dhakeshwari Temple" ,
                " Dhakeshwari Rd, Dhaka"));
        words.add(new Word("Bangladesh National Zoo" ,
                " 1216, Zoo Rd, Dhaka"));
        words.add(new Word("Liberation War Museum" ,
                "5 Segun Bagicha Rd, Dhaka 1000"));
        words.add(new Word("Shaheed Minar, Dhaka" ,
                "1000, Secretariate Rd, Dhaka 1000"));
        words.add(new Word("Bangabandhu Museum" ,
                "Dhanmondi 32, Rd No 12, Dhaka"));
        words.add(new Word("Gulshan Lake Park" ,
                "Rd No 63, Dhaka 1212"));


        WordAdapter adapter = new WordAdapter(getActivity() , words);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }


}
