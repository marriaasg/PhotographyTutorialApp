package com.example.photographytutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class TutorialFragment extends Fragment {

    private CardView TutCard1,TutCard2,TutCard3,TutCard4;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fragment_tutorial, container, false);

        TutCard1= view.findViewById(R.id.TutCard1);
        TutCard2= view.findViewById(R.id.TutCard2);
        TutCard3= view.findViewById(R.id.TutCard3);
        TutCard4= view.findViewById(R.id.TutCard4);

        TutCard1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(getActivity(),HomeActivity.class));
            }
        });

        return view;
    }
}
