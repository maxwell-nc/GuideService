package graduation.project.exhibition.servlet;

import graduation.project.exhibition.daf.ResultProcesser.SimpleOnGetResultSetListener;
import graduation.project.exhibition.dao.GetUserDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getusername")
// 对应的Servlet地址
public class GetUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetUsernameServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		final String code = request.getParameter("code");

		// 设置编码,防止乱码
		response.setCharacterEncoding("utf-8");
		// 解决跨域CROS问题
		response.setHeader("Access-Control-Allow-Origin", "*");

		// 获取返回输出流
		final PrintWriter out = response.getWriter();

		// 利用DAO读取数据并返回
		GetUserDAO.get(code, new SimpleOnGetResultSetListener() {

			@Override
			public void onGetResultSet(ResultSet rs) {

				String returnString = "";
				try {
					if (rs.next()) {
						returnString = rs.getString("name");
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

				// 返回给客户端
				out.print(returnString);
				out.flush();
				out.close();
			}

		});
	}

}
