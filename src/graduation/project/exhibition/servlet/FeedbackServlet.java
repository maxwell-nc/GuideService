package graduation.project.exhibition.servlet;

import graduation.project.exhibition.daf.ResultProcesser.SimpleOnGetResultSetListener;
import graduation.project.exhibition.dao.FeedbackDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedback")
// 对应的Servlet地址
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FeedbackServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		final String org = new String(request.getParameter("text").getBytes("ISO8859-1"), "UTF-8");
		final String text = URLDecoder.decode(org,"utf-8");
		
		final String code = request.getParameter("code");

		// 设置编码,防止乱码
		response.setCharacterEncoding("utf-8");
		
		// 解决跨域CROS问题
		response.setHeader("Access-Control-Allow-Origin", "*");

		// 获取返回输出流
		final PrintWriter out = response.getWriter();

		// 利用DAO读取数据并返回
		FeedbackDAO.get(code,text,new SimpleOnGetResultSetListener() {

			@Override
			public void onGetRowCount(int rowCount) {
				// TODO Auto-generated method stub
				super.onGetRowCount(rowCount);

				String returnString;
				if (rowCount==1) {
					returnString = "1";	
				}else{
					returnString = "0";	
				}
				
				// 返回给客户端
				out.print(returnString);
				out.flush();
				out.close();
				
			}

		});
	}

}
