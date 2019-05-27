package com.dishizu.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dishizu.dao.XinWenXQdao;
import com.dishizu.entity.XinWenXQ;
import com.dishizu.until.DBManager;

public class XinWenXQdaoimpl implements XinWenXQdao {
  public List<XinWenXQ> queryXinWenXQs(){
	  List<XinWenXQ> xwxq=new ArrayList<XinWenXQ>();
	  
	  ResultSet rs = DBManager.querySQL("SELECT * FROM chechedb.xinwenXQ;");
	  
	  try {
		while(rs.next()){
			XinWenXQ xq= new XinWenXQ();
			xq.setIdxinwen(rs.getInt(1));
			xq.setXinWenxq(rs.getString(2));
			xwxq.add(xq);
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return xwxq;
	  
  }
}
