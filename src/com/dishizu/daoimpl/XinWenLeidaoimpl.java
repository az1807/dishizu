package com.dishizu.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dishizu.dao.XinWenLeidao;
import com.dishizu.entity.XinWenLei;
import com.dishizu.until.DBManager;



public class XinWenLeidaoimpl implements XinWenLeidao {
	public List<XinWenLei> queryXinWenLeis() {
		List<XinWenLei> xwlb = new ArrayList<XinWenLei>();

		ResultSet rs = DBManager.querySQL("SELECT * FROM chechedb.xinwenleibiebiao;");



       try {
		while(rs.next()){
			XinWenLei lb = new XinWenLei(); 
			lb.setidxinwen(rs.getInt(1));
			lb.setxinwenleibie(rs.getString(2));
			xwlb.add(lb);
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return xwlb;

	}

}
