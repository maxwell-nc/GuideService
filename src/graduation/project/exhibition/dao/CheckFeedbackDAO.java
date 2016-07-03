package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class CheckFeedbackDAO extends BaseDAO {

	public static void get(String code, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		String sql = "select * from feedback where usercode=?";
		accesser.asyncQuery(listener, sql,code);

		// 关闭连接器
		accesser.close();
	}

}
