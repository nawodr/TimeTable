/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import CreateTable.CreateTable;
import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static jdk.javadoc.internal.doclets.toolkit.util.VisibleMemberTable.Kind.PROPERTIES;
import jdk.vm.ci.meta.Constant;

/**
 *
 * @author Nawod
 */
public class DBConnection {

    private static Connection con = null;
    private static String DBpath = "db.db";

    public static boolean isDatabaseExist(String dbPath) {
        File file = new File(dbPath);
        return file.exists();
    }

    public static Connection getConnection() {
        if (isDatabaseExist(DBpath)) {
            //DBpath = path.concat("\\db.db");

            try {

                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:db.db");

//            System.out.println("Connection Succesfull");
                if (con == null || con.isClosed()) {
                    Class.forName("org.sqlite.JDBC");
                    con = DriverManager.getConnection("jdbc:sqlite:db.db");
                    System.out.println("Connection Succesfull");
                }

                return con;

            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
                return null;
            }
        } else {
//            System.out.println("else => ");
            CreateTable.createDatabase(DBpath);

        }
        return con;

    }
}
