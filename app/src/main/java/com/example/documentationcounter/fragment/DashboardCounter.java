package com.example.documentationcounter.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.documentationcounter.R;
import com.example.documentationcounter.databinding.DashboardCounterFragmentBinding;
import com.example.documentationcounter.model.Document;
import com.example.documentationcounter.viewmodel.DashboardCounterViewModel;

public class DashboardCounter extends Fragment {

    private DashboardCounterViewModel mViewModel;

    public DashboardCounter() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        DashboardCounterFragmentBinding binding = DataBindingUtil.inflate(inflater,R.layout.dashboard_counter_fragment, container, false);
        mViewModel = new ViewModelProvider(this).get(DashboardCounterViewModel.class);
        binding.setDashboardCounterViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }

}