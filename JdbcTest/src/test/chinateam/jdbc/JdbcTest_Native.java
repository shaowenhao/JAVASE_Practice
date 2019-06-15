package test.chinateam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class JdbcTest_Native {
	public static void main(String args[]) throws Exception {

		//String url = "jdbc:compositesw:dbapi@localhost:9401?domain=composite&dataSource=perf&encrypt=false";
		String url = "jdbc:sqlserver://dv-perf-ds13.dv.local:1433;databaseName=RELATIONSHIP;";
		String userName = "sa";
        String password = "coxxmexx2xx1";
		
		Connection conn = null;;
        Statement stmnt = null;
        ResultSet rs = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        ResultSetMetaData rsmd = null;	
        int total=1;
        long[] totalList= new long[total];
        int index=0;
        int rows = 0;
        long startTime=System.currentTimeMillis();
      //String sql = "SELECT  * FROM RELATIONSHIP.dbo.DS2230B";
        
        //String sql = "SELECT     C_ID,     FIRST_NAME,     MIDDLE_NAME,     LAST_NAME,     ADDRESS,     CITY,     STATE,     SSN#,     DL#,     CELLPHONE,     WORKPHONE,     COMPANYNAME,     BUSINESSNAME,     BUSINESS_ADDRESS,     BUSINESS_CITY,     BUSINESS_STATE,     BUSINESS_PHONE,     BUSINESS_FAX,     CREATED_BY,     COL11,     COL12,     COL13,     COL14,     COL15,     COL16,     COL17,     COL18,     COL19,     COL20,     COL61,     COL62,     COL63,     COL64,     COL65,     COL66,     COL67,     COL68,     COL69,     COL70,     COL71,     COL85,     COL86,     COL87,     COL88,     COL89,     COL90,     COL91,     COL92,     COL93,     COL94,     COL135,     COL136,     COL137,     COL138,     COL139,     COL140,     COL141,     COL142,     COL143,     COL144,     COL145,     COL148,     COL149,     COL154,     COL165,     COL166,     COL167,     COL168,     COL169,     COL170,     COL171,     COL172,     COL173,     COL174,     COMMENTS  FROM RELATIONSHIP.dbo.DS2230B";
        String sql = "SELECT     CITY,     STATE,     BUSINESSNAME,     BUSINESS_CITY,     BUSINESS_STATE,     CREATED_BY  FROM RELATIONSHIP.dbo.DS2230B";
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);
            System.in.read();
            stmnt = conn.createStatement();
            rs = stmnt.executeQuery(sql);
            while (rs.next()) {
            	rsmd = rs.getMetaData();
				int columns = rsmd.getColumnCount();
				//System.out.println("column count = " + columns);
				rows = 1;
				int type = 0;
				while (rs.next()) {
					
					for (int i = 1; i <= columns; i++) {
						rs.getObject(i);
						
					}

					rows++;
				}
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
                rs.close();}
            if (stmnt != null){
                stmnt.close();}
            if (conn != null){
                conn.close();}
        }
	}

}
