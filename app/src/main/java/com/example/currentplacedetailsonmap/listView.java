package com.example.currentplacedetailsonmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reubenvarghese1 on 28/11/17.
 */

public class listView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView)findViewById(R.id.mechanics);
        ListAdapter listAdapter = new ListAdapter(this, getListItemData());
        mListView.setAdapter(listAdapter);
    }
    private List getListItemData() {
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Taj Hotel", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","5.0", "Indian"));
        listViewItems.add(new ItemObjects("Manhattan", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","3.7", "Chinese"));
        listViewItems.add(new ItemObjects("ITC ", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","4.6", "Thai"));
        listViewItems.add(new ItemObjects("New taj", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","5.0", "Indian"));
        listViewItems.add(new ItemObjects("Oberoi", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","3.7", "Chinese"));
        listViewItems.add(new ItemObjects("New restaurant", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","4.6", "Thai"));
        listViewItems.add(new ItemObjects("Taj Hotel", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","5.0", "Indian"));
        listViewItems.add(new ItemObjects("Manhattan", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","3.7", "Chinese"));
        listViewItems.add(new ItemObjects("ITC ", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","4.6", "Thai"));
        listViewItems.add(new ItemObjects("New taj", "A five star hotel known for its speciality in Indian food. Find your nearest hotel now!","5.0", "Indian"));
        return listViewItems;
    }
}
