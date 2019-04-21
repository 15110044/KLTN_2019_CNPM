package com.project.dao;

import java.util.*;

import com.project.model.*;

public class DichVuDAO {
	private static final Map<String, DichVuCungCap> dvMap = new HashMap<String, DichVuCungCap>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
    	DichVuCungCap dv1 = new DichVuCungCap(1, "Son Nha",null,null);
    	DichVuCungCap dv2 = new DichVuCungCap(2, "Lat Nen",null,null);
    	DichVuCungCap dv3 = new DichVuCungCap(3, "Xay Nha",null,null);
 
    	dvMap.put(String.valueOf(dv1.getMaDVCC()), dv1);
    	dvMap.put(String.valueOf(dv2.getMaDVCC()), dv2);
    	dvMap.put(String.valueOf(dv3.getMaDVCC()), dv3);
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
