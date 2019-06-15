package test.chinateam.jdbc;

import java.sql.Connection;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;

public class JdbcTest_Thread {
	public static void main(String args[]) throws Exception {
		//Thread t1 = new Thread(new Dumpcap()); t1.start();
		//Thread.sleep(1000);
		System.in.read();
		Thread t2 = new Thread(new FetchData()); t2.start();
        t2.join();
        //Thread.sleep(1000);
        //CommandLine cmdLine = CommandLine.parse("cmd /c cd C:\\Program FIles\\Wireshark\\ && start dumpcap -i 4 -w 0.0.pcapng");
        //DefaultExecutor executor = new DefaultExecutor();
        //int exitValue = executor.execute(cmdLine);
        }
        


static class Dumpcap implements Runnable { 
	public void run(){ 
		try 
        {  
         // We are running "dir" and "ping" command on cmd 
         //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd c:\Program Files\Wireshark\ && dumpcap -i 4 -w 0.0.pcapng\""); 
         
         CommandLine cmdLine = CommandLine.parse("cmd /c cd C:\\Program FIles\\Wireshark\\ && start dumpcap -i 4 -w 0.0.pcapng");
         DefaultExecutor executor = new DefaultExecutor();
         int exitValue = executor.execute(cmdLine);
        } 
        catch (Exception e) 
        { 
            System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
            e.printStackTrace(); 
            System.exit(1);
        } 
	} 
}

static class FetchData implements Runnable { 
	public void run(){ 
		String userName = "admin";
		String password = "admin";
		//String url = "jdbc:compositesw:dbapi@localhost:9401?domain=composite&dataSource=perf&encrypt=false&enableFlood=true";
		String url = "jdbc:compositesw:dbapi@localhost:9401?domain=composite&dataSource=perf&encrypt=false";
		
		Connection conn = null;;
        Statement stmnt = null;
        ResultSet rs = null;
        String driver = "cs.jdbc.driver.CompositeDriver";

        ResultSetMetaData rsmd = null;	
        int total=1;
        long[] totalList= new long[total];
        int index=0;
        for(int j=0;j<total;j++) {
        	int rows = 0;
            try {
            	index=j;
            	long startTime=System.currentTimeMillis();
                Class.forName(driver);
                conn = DriverManager.getConnection(url, userName, password);
                
                //String sql = "SELECT  * FROM view_sqlScriptDelay";
                //String sql = "SELECT  * FROM view1";
                String sql = "SELECT  * FROM DS2230B fetch 20000 rows only";
                stmnt = conn.createStatement();
                rs = stmnt.executeQuery(sql);
                if (rs == null) {
    				throw new SQLException("sql=`" + sql
    						+ "` did not generate a result set");
    			}
                
                while (rs.next()) {
                	rsmd = rs.getMetaData();
    				int columns = rsmd.getColumnCount();
    				//System.out.println("column count = " + columns);
    				rows = 1;
    				int type = 0;
    				while (rs.next()) {
    					
    					//System.out.print("row = `" + rows + "`  ");
    					for (int i = 1; i <= columns; i++) {
    						rs.getObject(i);
    						/*
    						type = rsmd.getColumnType(i);
    						System.out.print("type=" + type);
    						switch (type) {
    						case Types.INTEGER:
    							System.out.print(" col[" + i + "]=`" + rs.getInt(i)
    									+ "` ");
    							break;

    						case Types.SMALLINT:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getShort(i) + "` ");
    							break;

    						case Types.TINYINT:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getByte(i) + "` ");
    							break;

    						case Types.BIGINT:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getLong(i) + "` ");
    							break;

    						case Types.FLOAT:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getFloat(i) + "` ");
    							break;

    						case Types.REAL:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getFloat(i) + "` ");
    							break;

    						case Types.DECIMAL:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getBigDecimal(i) + "` ");
    							break;

    						case Types.DOUBLE:
    							// System.out.print("[[" + rs.getString(i) + "]]");
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getDouble(i) + "` ");
    							break;

    						case Types.NUMERIC:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getFloat(i) + "` ");
    							break;

    						case Types.CHAR:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getString(i) + "` ");
    							break;

    						case Types.VARCHAR:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getString(i) + "` ");
    							break;

    						case Types.LONGVARCHAR:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getString(i) + "` ");
    							break;

    						case Types.DATE:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getDate(i) + "` ");
    							break;

    						case Types.TIME:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getTime(i) + "` ");
    							break;

    						case Types.TIMESTAMP:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getTimestamp(i) + "` ");
    							break;
    						//
    						// System.out.println(" col[" + i + "]=`"
    						// + rs.getTimestamp(i) + "`  "
    						// + rs.getTimestamp(i).getTime() + " ");
    						// // Calendar cal =
    						// //
    						// Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
    						// Calendar cal = Calendar.getInstance(TimeZone
    						// .getTimeZone("CCT"));
    						// Timestamp ts = rs.getTimestamp(i, cal);
    						// cal.setTime(ts);
    						// System.out.println(" col[" + i + "]=`" + ts + "` "
    						// + ts.getTime() + " " + cal);
    						// System.out.println("\n\n");
    						// String[] ids = TimeZone.getAvailableIDs();
    						// for (String id : ids) {
    						// System.out.println(id);
    						// }
    						// break;

    						case Types.BOOLEAN:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getBoolean(i) + "` ");
    							break;
    						case Types.BLOB:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getBlob(i) + "` ");
    							break;
    						default:
    							System.out.print(" col[" + i + "]=`"
    									+ rs.getString(i) + "` ");
    							break;
    						}*/
    					}

    					//System.out.println("\n");
    					rows++;
    					/*if(rows==600) {
    						conn.close();
    						break;
    					}*/
    				}

    				rs.close();
                }
                long endTime=System.currentTimeMillis();
                //System.out.println(index+"/n");
        		totalList[index]=endTime-startTime;
        		System.out.println(totalList[index]);
            } catch (ClassNotFoundException cnfex) {
                cnfex.printStackTrace();
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            } finally {
                if (rs != null){
                    try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
                if (stmnt != null){
                    try {
						stmnt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
                if (conn != null){
                    try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
            }
    	}  
        Arrays.sort(totalList);
        System.out.println(totalList[0]);
   }

}
}