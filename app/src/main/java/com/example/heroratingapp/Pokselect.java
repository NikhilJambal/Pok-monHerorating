package com.example.heroratingapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;


public class Pokselect extends Fragment {

    ListView listView;


    ArrayList <pokheroname> arrayList = new ArrayList <>();


    public Pokselect() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokselect, container, false);
        listView = view.findViewById(R.id.lv1);
        pokheroname s1 = new pokheroname();
        s1.setImage(R.drawable.five);
        s1.setPokname("Pikichu");
        s1.setPokpower("1000");


        pokheroname s2 = new pokheroname();
        s2.setImage(R.drawable.four);
        s2.setPokname("uuffkf");
        s2.setPokpower("9000");


        pokheroname s3 = new pokheroname();
        s3.setImage(R.drawable.three);
        s3.setPokname("Kolofk");
        s3.setPokpower("87000");


        pokheroname s4 = new pokheroname();
        s4.setImage(R.drawable.two);
        s4.setPokname("johnohjjsjjsjsj");
        s4.setPokpower("80000");


        pokheroname s5 = new pokheroname();
        s5.setImage(R.drawable.one);
        s5.setPokname("mgrng");
        s5.setPokpower("90000");


        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);


        MyAdapter obj = new MyAdapter(getActivity(), R.layout.poklist, arrayList);
        listView.setAdapter(obj);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        Firstfrag firstfrag = new Firstfrag();
                        fragmentTransaction.replace(R.id.my_playGame, firstfrag);
                        fragmentTransaction.commit();
                        Toast.makeText(getActivity(), "One", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        SecondFrg secondFrg = new SecondFrg();
                        fragmentTransaction1.replace(R.id.my_playGame, secondFrg);
                        fragmentTransaction1.commit();
                        Toast.makeText(getContext(), "Two", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        ThirdFrg Thirdfrag = new ThirdFrg();
                        fragmentTransaction2.replace(R.id.my_playGame, Thirdfrag);
                        fragmentTransaction2.commit();
                        Toast.makeText(getContext(), "Three", Toast.LENGTH_SHORT).show();
                        break;

                }


            }


        });


        return view;


    }


}



















