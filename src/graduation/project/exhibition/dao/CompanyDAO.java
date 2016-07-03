package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class CompanyDAO extends BaseDAO {

	public static void get(String id, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		
		if (id != null) {
			accesser.asyncQuery(listener,
					"select * from home_company where id=?", id);
		} else {
			accesser.asyncQuery(listener, "select * from home_company");
		}

		// 关闭连接器
		accesser.close();
	}

}
