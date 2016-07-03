package graduation.project.exhibition.servlet;

import graduation.project.exhibition.daf.ResultProcesser.SimpleOnGetResultSetListener;
import graduation.project.exhibition.dao.ServiceDAO;
import graduation.project.exhibition.domain.Service;
import graduation.project.exhibition.json.JSONProcesser;
import graduation.project.exhibition.xml.XMLProcesser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/service")
// 对应的Servlet地址
public class ServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServiceServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		final String discoverType = request.getParameter("class");

		// 客户端请求的返回数据类型
		final String type = request.getParameter("type");

		// 设置编码,防止乱码
		response.setCharacterEncoding("utf-8");
		// 解决跨域CROS问题
		response.setHeader("Access-Control-Allow-Origin", "*");

		// 获取返回输出流
		final PrintWriter out = response.getWriter();

		// 利用DAO读取数据并返回
		ServiceDAO.get(discoverType,new SimpleOnGetResultSetListener() {

			@Override
			public void onGetResultSet(ResultSet rs) {

				String returnString;

				// 根据用户的需求
				if (type != null && "xml".equals(type)) {
					// 把结果集存为XML
					returnString = XMLProcesser.putInXML(rs, new Service());
				} else {
					// 把结果集存为JSON
					returnString = JSONProcesser.putInJSON(rs, new Service());
				}

				// 返回给客户端
				out.println(returnString);
				out.flush();
				out.close();
			}

		});
	}

}
