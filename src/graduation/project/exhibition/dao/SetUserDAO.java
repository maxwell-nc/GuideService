package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

/**
 * 展厅用户信息的DAO
 */
public class SetUserDAO extends BaseDAO {

	public static void set(String code,String name,OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);

		accesser.asyncQuery(null, "insert into username values (?,?) ", code,name);
		accesser.asyncUpdate(listener, "UPDATE username SET name = ? WHERE code = ?",name,code);
		
		// 关闭连接器
		accesser.close();
	}

}
