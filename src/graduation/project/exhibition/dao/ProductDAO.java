package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class ProductDAO extends BaseDAO {

	public static void get(String com, String id, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		if (com != null) {
			accesser.asyncQuery(listener,"select * from product where comid=?", com);
		} else if (id != null) {
			accesser.asyncQuery(listener, "select * from product where id=?",id);
		} else {
			accesser.asyncQuery(listener, "select * from product");
		}

		// 关闭连接器
		accesser.close();
	}

}
