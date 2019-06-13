package hanjen.eventwebsite.controller;

import hanjen.eventwebsite.data.EventData;
import hanjen.eventwebsite.events.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class Controller {

    private final EventData data ;

    @Autowired
    public Controller(EventData data) {
        this.data = data;
    }

    @RequestMapping("/events")
    public List<Events> name(@RequestParam(value = "event", defaultValue = "An event") String event) throws SQLException {
        return data.getEvents();
    }
}

