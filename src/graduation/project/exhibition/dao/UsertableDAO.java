package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

/**
 * 展厅用户信息的DAO
 */
public class UsertableDAO extends BaseDAO {

	/**
	 * 获得用户信息
	 * 
	 * @param userName
	 *            用户名
	 * @param listener
	 *            处理结果使用的监听器
	 */
	public static void getUserInfo(String userName,
			OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		// 异步查询数据库
		if (userName == null || userName.isEmpty()) {
			accesser.asyncQuery(listener, "select * from usertable");
		}else {
			accesser.asyncQuery(listener, "select * from usertable where username=?",userName);
		}

		// 关闭连接器
		accesser.close();
	}

}
