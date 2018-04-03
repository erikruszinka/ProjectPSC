package City.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQL {

    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3307/countrydata";
    private String username="root";
    private String password="";

    public String getPSC(String nazovobce){
        String result = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url,username,password);
            String query = "select psc from countrydata where obec ='"+nazovobce+"'";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                result = rs.getString("psc");
            }
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        return result;
    }

    public String getObec(String psc){
        String result = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, username, password);
            String query = "select obec from countrydata where psc ='" +psc+ "'";
            PreparedStatement p = conn.prepareStatement(query);
            ResultSet rs = p.executeQuery();
            while(rs.next()) {
                result = rs.getString("obec");
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());

        }
        return result;
    }
}
