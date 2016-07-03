package graduation.project.exhibition.daf.thread;

import graduation.project.exhibition.daf.ResultProcesser.OnGetResultListener;
import graduation.project.exhibition.daf.controller.ConnectionPoolController;

import java.sql.Connection;


/**
 * 非事务SQL执行线程
 */
public class NonTransactionThread {

	/**
	 * Connection
	 */
	protected Connection conn;
	
	/**
	 * 执行的SQL语句
	 */
	protected String sql;
	
	/**
	 * SQL语句的参数
	 */
	protected String[] parameters;

	/**
	 * 连接池控制器
	 */
	protected ConnectionPoolController cpController;

	/**
	 * 获得要执行的SQL语句和连接池控制器
	 * @param cpController 连接池控制器
	 * @param sql 执行的SQL语句
	 * @param parameters SQL语句的参数
	 */
	public NonTransactionThread(ConnectionPoolController cpController, String sql,
			String... parameters) {
		this.sql = sql;
		this.parameters = parameters;
		this.cpController = cpController;
	}

	/**
	 * 结果监听器
	 */
	protected OnGetResultListener listener;

	/**
	 * 设置结果监听器
	 * @param listener 结果监听器
	 */
	public void setOnGetResultSetListener(OnGetResultListener listener) {
		this.listener = listener;
	}

}
