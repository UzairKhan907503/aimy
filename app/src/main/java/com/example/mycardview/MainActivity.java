package com.example.mycardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import com.example.mycardview.databinding.ActivityMainBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ActivityMainBinding binding;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialSetup();
       /* ArrayList<RecyclerItem> recyclerList = new ArrayList<>();
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Phone Number","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_gimage,"Google","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Facebook","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Phone Number","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Google","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Facebook","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Phone Number","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Google","Bind"));
        recyclerList.add(new RecyclerItem(R.drawable.ic_baseline_call_24,"Facebook","Bind"));
        mRecyclerView = binding.recyclerView;
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new RecyclerAdapter(recyclerList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);*/

    }
    private void initialSetup() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        context = MainActivity.this;
    }

}