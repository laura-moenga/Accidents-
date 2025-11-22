
package dao
import model.Location;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LocationDAO {

    public List<Location> getAllLocations() {
        List<Location> list = new ArrayList<>();
        String sql = "SELECT * FROM locations";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Location(
                        rs.getInt("locationid"),
                        rs.getString("Type"),
                        rs.getString("name"),

                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
