import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class dataanalyzer {
    public static  Map<String,Integer> getaccidentsbycity(){
        map<String ,Integer>map =new HashMao<>();
        String sql = "SELECT city ,count(*)AS total FROM accidents JOIN locations USING (location_id) GROUP BY city";
    try(
    Connection conn = databaseconnection.connect();
    Statement stmt=conn.createstatement();
    ResultSet rs=stmt.executrQuery(sql));{
        while (rs.next()){
            map.put(rs.getString ("city"),rs.getInt("total"));
        }catch (SQLExcetion e){
            e.printStackTrace();
            }
        return  map;
        }}





    }
}