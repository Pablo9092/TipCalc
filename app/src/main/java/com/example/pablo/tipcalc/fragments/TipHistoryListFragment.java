package com.example.pablo.tipcalc.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pablo.tipcalc.Display_Details;
import com.example.pablo.tipcalc.R;
import com.example.pablo.tipcalc.adapters.OnItemClickListener;
import com.example.pablo.tipcalc.adapters.TipAdapter;
import com.example.pablo.tipcalc.models.TipRecord;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class TipHistoryListFragment extends Fragment implements TipHistoryListFragmentListener, OnItemClickListener {
    public final static String DETAILS = "com.example.pablo.tipcalc.fragments.MESSAGE";

    @Bind(R.id.recyclerView)
    RecyclerView reciclerView;

    TipAdapter adapter;

    public TipHistoryListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tip_history_list, container, false);
        ButterKnife.bind(this, view);
        initAdapter();
        initRecyclerView();
        return view;
    }

    private void initAdapter() {
        if(adapter == null){
            adapter = new TipAdapter(getActivity().getApplicationContext(), this);
        }
    }

    private void initRecyclerView() {
        reciclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        reciclerView.setAdapter(adapter);
    }


    @Override
    public void addToList(TipRecord record) {
        adapter.add(record);
    }

    @Override
    public void clearList() {
        adapter.clear();
    }

    @Override
    public void onItemClick(TipRecord tipRecord) {
        //Log.v("MENSAJE: ",  tipRecord.getDateFormated());
        Intent intent = new Intent(getActivity().getApplicationContext(), Display_Details.class);
        //String message;
        //message = tipRecord.getDateFormated();
        intent.putExtra("Bill", tipRecord.getBill());
        intent.putExtra("Tip", tipRecord.getTip());
        intent.putExtra("DateT", tipRecord.getDateFormated());
        startActivity(intent);
    }
}
