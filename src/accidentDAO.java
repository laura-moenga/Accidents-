import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class accidentDAO {
    public List<Accidents>getAllAccidents(){
        List<accidents>accidents=new ArrayList<>();
        String query="select * from accidents";

        try(Connection conn= databaseconnection.connect();
        Statement stmt= conn.createStatement();
        ResultSet rs= stmt.executrQuery(query)){

            while(rs.next()){
                accidents.add(new accidents(
                        rs.getint("accident_id"),
                        rs.getint("location_id"),
                        rs.getString("Date"),
                        rs.getString ("cause"),
                        rs.getint ("fatalities"),
                ));
            }
            catch (SQLException e){
                e.printStackTrace();}
            return accidents;
            }
        public int countaccidentsbycity(String city){
            String query ="SELECT COUNT (*) FROM accidents a Join locations1 ON a.location_id=1.location id WHER 1.city=";
            try(Connection conn= databaseconnection.connect());
            PreaparedStatement ps = conn.prepareStatement(query)){
    ps.setString(1,city);
    ResultSet rs = ps.executeQuery();
            }catch(SQLException e){
    e.printStackTrace();
            }
            return 0;
        }
    }
}