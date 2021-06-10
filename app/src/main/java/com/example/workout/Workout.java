package com.example.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts ={
            new Workout("lose", "10\n15\n25\n30"),
            new Workout("norm", "25\n25\n25\n25"),
            new Workout("hard", "40\n50\n23\n60"),
            new Workout("awesome", "100\n34\n45\n68")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }
}
