package graduation.project.exhibition.servlet;

import graduation.project.exhibition.daf.ResultProcesser.SimpleOnGetResultSetListener;
import graduation.project.exhibition.dao.SetUserDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setusername")
// 对应的Servlet地址
public class SetUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetUsernameServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		final String code = request.getParameter("code");

		final String org = new String(request.getParameter("name").getBytes("ISO8859-1"), "UTF-8");
		final String name = URLDecoder.decode(org,"utf-8");
		
		// 设置编码,防止乱码
		response.setCharacterEncoding("utf-8");
		// 解决跨域CROS问题
		response.setHeader("Access-Control-Allow-Origin", "*");

		// 获取返回输出流
		final PrintWriter out = response.getWriter();

		// 利用DAO读取数据并返回
		SetUserDAO.set(code,name, new SimpleOnGetResultSetListener() {

			@Override
			public void onGetRowCount(int rowCount) {
			
				// 返回给客户端
				out.print(rowCount);
				out.flush();
				out.close();
				
			}
			
		});
	}

}
