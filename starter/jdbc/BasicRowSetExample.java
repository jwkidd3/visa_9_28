package labs.starter.jdbc;

import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Timestamp;

/**
 * The following example illustrates the basic use
 * of a JDBC RowSet.
 *
 * @author developintelligence llc
 * @veresultSetion 1.0
 */
public class BasicRowSetExample {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    String select = "SELECT * FROM USER";
    String url = "jdbc:mysql://localhost/flex";

    JdbcRowSet rowSet = new JdbcRowSetImpl();
    rowSet.setUrl(url);
    rowSet.setUsername("root");
    rowSet.setPassword("");
    rowSet.setCommand(select);
    rowSet.execute();

    //let's add a user
    rowSet.moveToInsertRow();
    rowSet.updateString(2, "testuser");
    rowSet.updateString(3, "pass");
    rowSet.updateTimestamp(4, new Timestamp(System.currentTimeMillis()));
    rowSet.updateTimestamp(5, new Timestamp(System.currentTimeMillis()));
    rowSet.insertRow();

    //now let's print the results
    System.out.printf("%-10s%-10s%-10s \n",
                      "userid","username","password");
    while(rowSet.next()) {
      System.out.printf("%-10s%-10s%-10s\n", rowSet.getInt(1),
                        rowSet.getString(2), rowSet.getString(3));
    }

    rowSet.close();
  }
}
