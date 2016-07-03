package graduation.project.exhibition.dao;

import graduation.project.exhibition.daf.CommonAccesser;
import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;

public class WebCompanyDAO extends BaseDAO {

	public static void get(String Name, OnGetResultListener listener) {

		// 创建数据库连接器
		CommonAccesser accesser = new CommonAccesser(propPath);
	// 异步查询数据库
		
		if (Name !=null && !Name.isEmpty()) {
			accesser.asyncQuery(listener, "select * from web_company where com_no=?",Name);
		}else
		{
			accesser.asyncQuery(listener, "select * from web_company");
		}
		
		// 关闭连接器
		accesser.close();
	}

}
