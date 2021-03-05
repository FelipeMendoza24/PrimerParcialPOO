package entities;

import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;



    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }

    public Summary(Object date, int activeProjects) {
        this.activeProjects = activeProjects;

    }
}