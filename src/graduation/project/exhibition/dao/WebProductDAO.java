package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class WebProductDAO extends BaseDAO {

	public static void get(String Name, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
		if (Name !=null && !Name.isEmpty()) {
			accesser.asyncQuery(listener, "select * from web_product where pd_no=?",Name);
		}else
		{
			accesser.asyncQuery(listener, "select * from web_product");
		}

		// 关闭连接器
		accesser.close();
	}

}
