package com.fzu.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFinder(View view) {
        Spinner beerList = (Spinner) findViewById(R.id.beer_list);
        String str = beerList.getSelectedItem().toString();
        TextView beerViewer = (TextView) findViewById(R.id.beer_viewer);
        beerViewer.setText(str);
    }
}
