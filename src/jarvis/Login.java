package jarvis;

import java.util.Scanner;
import java.sql.*;

public class Login {
    public static Connection connection;
    public String databaseURL = "jdbc:ucanaccess://Data.accdb";
    public static String sql1;
    public static String sql2;
    public static String sql3;
    ResultSet rs;

//    public void registerClient(String u, String p) {
//        try {
//            connection=DriverManager.getConnection(databaseURL);
//            sql1="INSERT INTO Registration (username, password) VALUES (?,?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, u);
//            statement.setString(2, p);
//            statement.executeUpdate();
//            statement.close();
//            connection.close();
//
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }

    public boolean mgrLogin(String u, String p){
        boolean n=false;
        try {
            connection=DriverManager.getConnection(databaseURL);
            sql1="Select * From Manager";
            PreparedStatement statement = connection.prepareStatement(sql1);
            rs = statement.executeQuery();
            while(rs.next()){

                String user = rs.getString(1);
                String pass = rs.getString(2);

                if(user.equals(u)&&pass.equals(p)) {
                    n=true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;

    }

    public boolean empLogin(String u, String p){
        boolean r=false;
        try {
            connection=DriverManager.getConnection(databaseURL);
            sql2="Select * From Employee";
            PreparedStatement statement = connection.prepareStatement(sql2);
            rs = statement.executeQuery();
            while(rs.next()){

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if(user.equals(u)) {
                    r=true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;

    }

    public boolean clLogin(String u, String p){
        boolean c=false;
        try {
            connection=DriverManager.getConnection(databaseURL);
            sql3="Select * From Client";
            PreparedStatement statement = connection.prepareStatement(sql3);
            rs = statement.executeQuery();
            while(rs.next()){

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if(user.equals(u)&&pass.equals(p)) {
                    c=true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;

    }
//    //MANAGER LOGIN -----------------------------------------------------------
//    static String mgrU[] = new String[10];
//    static String mgrP[] = new String[10];
//
//    static String uname;
//    static String pass;
//    public Boolean mgrLogin(String uname, String pass) {
//        mgrU[0]="Admin";
//        mgrP[0]="Admin";
//        int n=0;
//
//
//        Boolean state=false;
//        while(state==false){
//
//
//            int x;
//            for(x=0; x<10; x++){
//                if(uname.equals(mgrU[x])){
//                    if(pass.equals(mgrP[x])){
//                        System.out.println("You have logged in Successfully.");
//                        state=true;
//
//                    }
//
//                }
//
//            }
//            break;
//
//
//        }
//
//
//        return state;
//
//    }


}
