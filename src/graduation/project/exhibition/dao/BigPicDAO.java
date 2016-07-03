package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class BigPicDAO extends BaseDAO {

	public static void get(OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		accesser.asyncQuery(listener, "select * from info_big_pic");

		// 关闭连接器
		accesser.close();
	}

}
