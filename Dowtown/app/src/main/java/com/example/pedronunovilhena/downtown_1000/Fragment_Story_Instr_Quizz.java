package com.example.pedronunovilhena.downtown_1000;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_Story_Instr_Quizz extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_fragment__story__instr__quizz, container, false);
        return view;

    }

   public void showInstructions(View v){
       Intent myIntent = new Intent(getActivity(), Start_App.class);
       getActivity().startActivity(myIntent);

   }
}