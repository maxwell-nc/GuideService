package graduation.project.exhibition.json;

import graduation.project.exhibition.domain.BaseDomain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * JSON处理器
 */
public class JSONProcesser {

	/**
	 * 把结果集转为JSON
	 * 
	 * @param rs
	 *            结果集
	 * @param domain
	 *            信息对象
	 * @return JSON文本
	 */
	public static String putInJSON(ResultSet rs, BaseDomain domain) {

		// 根
		JSONObject jsonObject = new JSONObject();

		// 表名数组
		JSONArray array = new JSONArray();
		jsonObject.put("response", array);

		try {

			while (rs.next()) {
				JSONObject sub = new JSONObject();

				// 每行都作为一个数组元素
				for (String rowName : domain.tableRows) {
					sub.put(rowName, rs.getString(rowName));
				}

				array.put(sub);
			}

		} catch (JSONException | SQLException e) {
			e.printStackTrace();
		}

		return jsonObject.toString();
	}
}
