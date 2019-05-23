package com.dishizu.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.dishizu.dao.XinWenLieBiaodao;
import com.dishizu.entity.XinWenLieBiao;
import com.dishizu.until.DBManager;

public class XinWenLieBiaodaoimpl implements XinWenLieBiaodao {
	public List<XinWenLieBiao> queryXinWenLieBiaos() {
		List<XinWenLieBiao> xwfl = new ArrayList<XinWenLieBiao>();
		ResultSet rs = DBManager.querySQL("select * from chechedb.xinwen;");
       try {
		while(rs.next()){
			XinWenLieBiao fl = new XinWenLieBiao(); 
			fl.setXinwenid(rs.getInt(1));
			fl.setXinwenliebiao(rs.getString(2));
			xwfl.add(fl);
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return xwfl;

	}
}
