package com.example.nellie.assignment_2;


import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.app.FragmentManager;
import android.view.ViewGroup;
import android.widget.Toast;




/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_1 extends Fragment implements View.OnClickListener{

    public Fragment_1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_fragment_1, container, false);
        View myButtonView = v.findViewById(R.id.imageButton);
        //Button myButton = (Button) myButtonView;
        myButtonView.setOnClickListener(this);
        return v;
    }
    @Override
    public void onClick(View v) {
        MainSkanetrafiken a = (MainSkanetrafiken) getActivity();
        Toast t = Toast.makeText(getActivity(),"Sök",Toast.LENGTH_LONG);
        t.show();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment_2 bf = new Fragment_2();
        ft.replace(R.id.activity_main,bf);
        ft.commit();

        //getFragmentManager().beginTransaction().replace(R.id.RelativeMenu,new ListFragment()).commit();
    }




}



