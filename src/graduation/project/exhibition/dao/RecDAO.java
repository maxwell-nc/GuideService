package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class RecDAO extends BaseDAO {

	public static void get(OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		accesser.asyncQuery(listener, "select * from info_rec");

		// 关闭连接器
		accesser.close();
	}

}
