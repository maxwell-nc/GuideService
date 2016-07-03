package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class DiscoverDetailDAO extends BaseDAO {

	public static void get(String id,OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		accesser.asyncQuery(listener, "select * from discover_detail where id="+id);

		// 关闭连接器
		accesser.close();
	}

}
