package entities;

import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public boolean isActive() {
        boolean oa = false;
        for (Activity a:this.activities){
            if (a.isActive == true)
                oa = true;
        }
        return oa;
    }
}
