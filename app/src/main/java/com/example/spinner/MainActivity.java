package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    Spinner spinner1, spinner2, spinner3;
    Button result;

    ArrayList<String> arrayList_countries;
    ArrayAdapter<String> arrayAdapter_countries;

    ArrayList<String> India_states,Japan_states,China_states;
    ArrayAdapter<String> states;

    ArrayList<String> Delhi,Maharashtra,MadhyaPradesh,Hakkaido,Tohoku,Kanto,Hainan,Zhejiang,Sichuan;
    ArrayAdapter<String> cities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        result = (Button)findViewById(R.id.button);

        arrayList_countries = new ArrayList<>();
        arrayList_countries.add("India");
        arrayList_countries.add("Japan");
        arrayList_countries.add("China");

        arrayAdapter_countries = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_countries);
        spinner1.setAdapter(arrayAdapter_countries);

        India_states = new ArrayList<>();
        India_states.add("Delhi");
        India_states.add("Maharashtra");
        India_states.add("Madhya Pradesh");

        Japan_states = new ArrayList<>();
        Japan_states.add("Hokkaido");
        Japan_states.add("Tohoku");
        Japan_states.add("Kanto");

        China_states = new ArrayList<>();
        China_states.add("Hainan");
        China_states.add("Zhejiang");
        China_states.add("Sichuan");

        Delhi = new ArrayList<>();
        Delhi.add("Najafgarh");
        Delhi.add("Janak Puri");
        Delhi.add("Rajouri Garden");

        Maharashtra = new ArrayList<>();
        Maharashtra.add("Mumbai");
        Maharashtra.add("Pune");
        Maharashtra.add("Nasik");

        MadhyaPradesh = new ArrayList<>();
        MadhyaPradesh.add("Indore");
        MadhyaPradesh.add("Bhopal");
        MadhyaPradesh.add("Gwalior");

        Hakkaido = new ArrayList<>();
        Hakkaido.add("Sapporo");
        Hakkaido.add("Hakodate");
        Hakkaido.add("Otaru");

        Tohoku = new ArrayList<>();
        Tohoku.add("Sendai");
        Tohoku.add("Morioko");
        Tohoku.add("Hirosaki");

        Kanto = new ArrayList<>();
        Kanto.add("Tokyo");
        Kanto.add("Yokohama");
        Kanto.add("Nikko");

        Hainan =new ArrayList<>();
        Hainan.add("Haikou");
        Hainan.add("Sanya");
        Hainan.add("Wenchang");

        Zhejiang = new ArrayList<>();
        Zhejiang.add("Hangzhou");
        Zhejiang.add("Wenzhou");
        Zhejiang.add("Ningbo");

        Sichuan = new ArrayList<>();
        Sichuan.add("Chengdu");
        Sichuan.add("Leshan");
        Sichuan.add("Yibin");




        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    // INDIA STATES//
                    states = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,India_states);
                    spinner2.setAdapter(states);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position==0){//DELHI CITIES//
                                cities = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,Delhi);
                            }
                            if(position==1){//MAHARASHTRA CITIES//
                                cities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,Maharashtra);
                            }
                            if(position==2){//MAHARASHTRA CITIES//
                                cities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,MadhyaPradesh);
                            }
                            spinner3.setAdapter(cities);

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
                if(position==1){//JAPAN STATES
                    states = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,Japan_states);
                    spinner2.setAdapter(states);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position == 0){
                                cities = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,Hakkaido);
                            }
                            if(position==1){
                                cities = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,Tohoku);
                            }
                            if(position==2){//MAHARASHTRA CITIES//
                                cities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,Kanto);
                            }
                            spinner3.setAdapter(cities);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if(position==2){//China STATES
                    states = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,China_states);
                    spinner2.setAdapter(states);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position == 0){
                                cities = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,Hainan);
                            }
                            if(position==1){
                                cities = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,Zhejiang);
                            }
                            if(position==2){//MAHARASHTRA CITIES//
                                cities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,Sichuan);
                            }
                            spinner3.setAdapter(cities);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sp1 = spinner1.getSelectedItem().toString();
                String sp2 = spinner2.getSelectedItem().toString();
                String sp3 = spinner3.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,"Country"+" "+sp1+",State"+" "+sp2+",City"+" "+ sp3 , Toast.LENGTH_LONG).show();
            }
        });
    }
}