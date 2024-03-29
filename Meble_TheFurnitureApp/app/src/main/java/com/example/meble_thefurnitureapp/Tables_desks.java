package com.example.meble_thefurnitureapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tables_desks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tables_desks extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Tables_desks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tables_desks.
     */
    // TODO: Rename and change types and number of parameters
    public static Tables_desks newInstance(String param1, String param2) {
        Tables_desks fragment = new Tables_desks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tables_desks, container, false);

        ImageView BedsideTableActivity = (ImageView) view.findViewById(R.id.BedsideTable);

        ImageView CafeTableActivity = (ImageView) view.findViewById(R.id.CafeTable);

        ImageView ChildrenTableActivity = (ImageView) view.findViewById(R.id.ChildrenTable);

        ImageView CoffeeSideTableActivity = (ImageView) view.findViewById(R.id.CoffeeandSideTables);

        ImageView ComputerDesksActivity = (ImageView) view.findViewById(R.id.ComputerDesks);

        ImageView DressingTablesActivity = (ImageView) view.findViewById(R.id.DressingTables);

        BedsideTableActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_BedsideTable.class);
                startActivity(i);
            }
        });

        CafeTableActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_CafeTable.class);
                startActivity(i);
            }
        });

        ChildrenTableActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_ChildrenTable.class);
                startActivity(i);
            }
        });

        CoffeeSideTableActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_CoffeeSideTables.class);
                startActivity(i);
            }
        });

        ComputerDesksActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_ComputerDesks.class);
                startActivity(i);
            }
        });

        DressingTablesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),TablesAndDesks_DressingTables.class);
                startActivity(i);
            }
        });
        return view;
    }
}