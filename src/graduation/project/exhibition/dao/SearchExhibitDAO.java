package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class SearchExhibitDAO extends BaseDAO {

	public static void get(String key, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		
		String sql = "select * from product where title like '%" + key+ "%' or text like '%" + key + "%'";

		accesser.asyncQuery(listener,sql);

		// 关闭连接器
		accesser.close();
	}

}
