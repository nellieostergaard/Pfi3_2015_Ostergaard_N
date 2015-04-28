package com.example.nellie.assignment_4;

/**
 * Created by Nellie on 2015-04-27.
 */

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


public class PlanetDialog extends DialogFragment  {



    public PlanetDialog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dialog_fragment, container, false);


    }

}

