package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Form;
/**
 * Servlet implementation class Contact
 */
@WebServlet("/contact")
public class Contact extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Form f = new Form();
		
		f.setName(request.getParameter("name"));
		f.setCampany(request.getParameter("campany"));
		f.setMail(request.getParameter("mail"));
		f.setInquiry(request.getParameter("inquiry"));
		
		
//		本当はメルマガもBeansに格納したかったですが出来ませんでした。
//		f.setMerumaga(request.getParameterValues("merumaga"));
		
		
		request.setAttribute("form", f);
//		
		String[] merumagas = request.getParameterValues("merumaga");
		String merumaga = "";
		if(merumagas != null) {
		for(String meru : merumagas) {
			merumaga = merumaga + meru + " ";	
		}
		request.setAttribute("merumaga", merumaga);
		}else{
		 String nasi = "ご希望のメルマガはありません";
		 request.setAttribute("merumaga", nasi);
		}
		
		
		
		if(request.getParameter("siryou").equals("yes")){
			request.getRequestDispatcher("siryouari.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("siryounasi.jsp").forward(request, response);
		}
		
	
		
	}

}
