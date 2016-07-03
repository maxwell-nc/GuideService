package graduation.project.exhibition.dao;

/**
 * DAO的基类
 */
public class BaseDAO {

	/**
	 * 配置文件路径
	 */
	protected static String propPath = null;

	static {

		try {

			// 获得配置文件路径
			propPath = Class.forName("cn.edu.gdou.dao.BaseDAO").getClassLoader()
					.getResource("/").getPath()+"Setting.properties";

			// System.out.println(path);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
