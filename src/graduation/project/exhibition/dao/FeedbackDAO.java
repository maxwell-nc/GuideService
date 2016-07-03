package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class FeedbackDAO extends BaseDAO {

	public static void get(String code,String text, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		
		accesser.asyncUpdate(listener, "INSERT INTO feedback(usercode,text)VALUES(?,?)", code,text);
	
		// 关闭连接器
		accesser.close();
	}

}
