
package dao;
import model.Vehicle;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO {

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> list = new ArrayList<>();
        String sql = "SELECT * FROM vehicles";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Vehicle(
                        rs.getInt("vehicle_id"),
                        rs.getString("accident_id"),
                        rs.getString("vehicle_type"),

                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
