package com.example.android.travlebd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 11/8/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0 , words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Word word = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);
        }

        TextView placeName = (TextView)convertView.findViewById(R.id.name_text_view);
        TextView placeAdd = (TextView)convertView.findViewById(R.id.add_text_view);

        placeName.setText(word.getPlaceName());
        placeAdd.setText(word.getPlaceAdd());

          return convertView;
    }

}
