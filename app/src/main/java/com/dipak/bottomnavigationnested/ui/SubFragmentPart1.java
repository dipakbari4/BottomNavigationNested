package com.dipak.bottomnavigationnested.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipak.bottomnavigationnested.R;
import com.dipak.bottomnavigationnested.databinding.FragmentSubPart1Binding;

public class SubFragmentPart1 extends Fragment {

    private FragmentSubPart1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSubPart1Binding.inflate(inflater, container, false);

        binding.goToParent.setOnClickListener(view -> {
            Navigation.findNavController(view).popBackStack();
        });
        return binding.getRoot();
    }
}