package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

/**
 * 展厅用户信息的DAO
 */
public class GetUserDAO extends BaseDAO {

	public static void get(String code,OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		// 异步查询数据库
		accesser.asyncQuery(listener, "select name from username where code=?",code);
		
		// 关闭连接器
		accesser.close();
	}

}
