package com.example.myo2024hafta0401;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SeekBar sb;
    TextView tv;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb=(SeekBar) findViewById(R.id.seekBar);
        tv=(TextView)findViewById(R.id.textView);
        lv=(ListView)findViewById(R.id.listView);
    sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
         updateListView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    }
    private void updateListView(){

        tv.setText(""+ sb.getProgress());
        ArrayList<String> liste= new ArrayList<>();

        liste.add("1*1=1");

        ArrayAdapter<String> adap= new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,liste);

        lv.setAdapter(adap);


    }
}