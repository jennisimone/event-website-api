package hanjen.eventwebsite.events;

import java.time.LocalDate;
import java.time.LocalTime;

public class Events {

    private String name;
    private String location;
    private LocalDate date;
    private LocalTime time;
    private int cost;
    private String type;


    public Events(String name, String location, LocalDate date, LocalTime time, int cost, String type) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.cost = cost;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}
