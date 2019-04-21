package com.Repairment.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import com.Repairment.Model.DichVuCungCap;

@Configuration
@EntityScan(basePackages = {"com.Repairment.Model"})  // scan JPA entities
public class DichVuDAO {	
	
	public static List<DichVuCungCap> getAll(){
		 try
		    {
		      // create our mysql database connection
		      String myDriver = "com.mysql.cj.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost:3306/repairment";
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
		      
		      // our SQL SELECT query. 
		      // if you only need a few columns, specify them by name instead of using "*"
		      String query = "SELECT MADVCC,TENDV FROM dichvucungcap";

		      // create the java statement
		      Statement st = conn.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      
		      // iterate through the java resultset
		      List<DichVuCungCap> dvcc =new ArrayList<DichVuCungCap>();
		      while (rs.next())
		      {
		    	  DichVuCungCap dv = new DichVuCungCap();
		    	  dv.setMaDVCC(rs.getInt("MADVCC"));
		    	  dv.setTenDV(rs.getString("TENDV"));
		    	  dvcc.add(dv);
		      }
		      st.close();
		      return dvcc;
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		      return null;
		    }
	}
	private static final Map<String, DichVuCungCap> dvMap = new HashMap<String, DichVuCungCap>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
    	List<DichVuCungCap> listDV = new ArrayList<DichVuCungCap>();
    	listDV = getAll();
    	if(listDV.size() > 0) {
    		for (DichVuCungCap dichVuCungCap : listDV) {
    			dvMap.put(String.valueOf(dichVuCungCap.getMaDVCC()), dichVuCungCap);
			}
    	}
    	else {
    		DichVuCungCap dv1 = new DichVuCungCap(1, "Son Nha",null,null);
        	DichVuCungCap dv2 = new DichVuCungCap(2, "Lat Nen",null,null);
        	DichVuCungCap dv3 = new DichVuCungCap(3, "Xay Nha",null,null);
     
        	dvMap.put(String.valueOf(dv1.getMaDVCC()), dv1);
        	dvMap.put(String.valueOf(dv2.getMaDVCC()), dv2);
        	dvMap.put(String.valueOf(dv3.getMaDVCC()), dv3);
    	}
    	
    }
 
    public DichVuCungCap getDichVuNo(String DichVuNo) {
        return dvMap.get(DichVuNo);
    }
 
    public DichVuCungCap addDichVu(DichVuCungCap dv) {
    	dvMap.put(String.valueOf(dv.getMaDVCC()), dv);
        return dv;
    }
 
    public DichVuCungCap updateDichVu(DichVuCungCap dv) {
    	dvMap.put(String.valueOf(dv.getMaDVCC()), dv);
        return dv;
    }
 
    public void deleteDichVu(String dichvuno) {
    	dvMap.remove(dichvuno);
    }
    public List<DichVuCungCap> getAllDichVu() {
        Collection<DichVuCungCap> c = dvMap.values();
        List<DichVuCungCap> list = new ArrayList<DichVuCungCap>();
        list.addAll(c);
        return list;
    }
}
