package com.nexters.gathering.nexters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.nexters.gathering.nexters.Adapter.NoticeListViewAdapter;
import com.nexters.gathering.nexters.Model.Notice;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Notice> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<Notice>();

        listView = (ListView)findViewById(R.id.noti_listView);
        NoticeListViewAdapter adapter = new NoticeListViewAdapter(getLayoutInflater(), data);
        listView.setAdapter(adapter);

    }
}
