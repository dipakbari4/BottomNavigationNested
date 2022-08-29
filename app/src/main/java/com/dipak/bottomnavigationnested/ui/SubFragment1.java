package com.dipak.bottomnavigationnested.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipak.bottomnavigationnested.R;
import com.dipak.bottomnavigationnested.databinding.FragmentSub1Binding;

public class SubFragment1 extends Fragment {

    private FragmentSub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSub1Binding.inflate(inflater, container, false);

        binding.btnSubFragment1.setOnClickListener(view -> {
            Navigation.findNavController(view).popBackStack();
        });

        binding.btnGoDeeper.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.subFragmentPart1);
        });
        return binding.getRoot();
    }
}