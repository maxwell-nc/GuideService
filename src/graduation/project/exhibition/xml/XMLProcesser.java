package graduation.project.exhibition.xml;

import graduation.project.exhibition.domain.BaseDomain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/**
 * XML处理器
 */
public class XMLProcesser {

	/**
	 * 把结果集转为XML
	 * 
	 * @param rs
	 *            结果集
	 * @param domain
	 *            信息对象
	 * @return XML文本
	 */
	public static String putInXML(ResultSet rs, BaseDomain domain) {

		// 建立XML文档
		Document document = DocumentHelper.createDocument();// <?xml
															// version="1.0"
															// encoding="UTF-8"?>
		Element root = document.addElement("table");
		root.addAttribute("name", domain.tableName);// <table name="xxx">

		try {

			while (rs.next()) {

				// 一行数据
				Element row = root.addElement("row");

				// 数据库中每一列作为一个节点
				for (String rowName : domain.tableRows) {
					// 一列
					Element col = row.addElement(rowName);
					// 设置值
					col.setText(rs.getString(rowName));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return document.asXML();
	}
}
