package com.example.mjgrusni.workout;

/**
 * Created by mjgrusni on 9/28/2016.
 */
public class Workout {

    private String name, descripion;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand pushups\n10 1-legged squats\n15 pull-ups"),
            new Workout("Core Agony",
                    "100 pull-ups\n100 push-ups\n100 squats"),
            new Workout("The Wimp Special",
                    "5 pull-ups\n10 push-ups\n15 squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    private Workout(String name, String descripion){
        this.name = name;
        this.descripion = descripion;
    }

    public String getDescripion(){
        return descripion;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }


}
