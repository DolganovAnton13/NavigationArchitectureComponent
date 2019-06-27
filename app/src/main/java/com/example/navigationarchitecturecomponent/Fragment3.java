package com.example.navigationarchitecturecomponent;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    Button button;
    NavController navController;
    public Fragment3() {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);

        button = (Button) view.findViewById(R.id.buttonFragment3Back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragment2);
            }
        });
        return view;
    }

}
