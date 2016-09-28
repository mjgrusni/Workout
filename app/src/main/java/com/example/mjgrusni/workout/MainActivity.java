package com.example.mjgrusni.workout;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*WorkoutDetailFragment frag = (WorkoutDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkoutId(1);*/
    }

    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setWorkoutId(id);
        ft.replace(R.id.fragment_container, details);
        ft.addToBackStack(null); //adds to back button stack
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
