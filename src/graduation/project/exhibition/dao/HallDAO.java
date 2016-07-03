package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class HallDAO extends BaseDAO {

	public static void get(String type, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		
		if ("rec".equals(type)) {
			accesser.asyncQuery(listener, "select * from hall where isRec=?",type);
		} else {
			accesser.asyncQuery(listener, "select * from hall where type=?",type);
		}

		// 关闭连接器
		accesser.close();
	}

}
