package hanjen.eventwebsite.data;

import hanjen.eventwebsite.events.Events;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class EventData {

    public List<Events> getEvents() throws SQLException {
        List<Events> events = new ArrayList<>();
        String sql = "SELECT * FROM Events";
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://db-workshop.public-dev.zuto.cloud:3306/bootcamp5", "bootcamp5", "FrogMountain");
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                events.add(new Events(resultSet.getString("name"),
                        resultSet.getString("location"),
                        resultSet.getDate("date").toLocalDate(),
                        resultSet.getTime("time").toLocalTime(),
                        resultSet.getInt("cost"),
                        resultSet.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
        return events;
    }
}
