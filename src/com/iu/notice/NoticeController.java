package com.iu.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.net.aso.n;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NoticeService noticeService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoticeController() {
		super();
		noticeService = new NoticeService();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 한글 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		// path info
		String command = request.getPathInfo();
		// method 형식
		String method = request.getMethod();
		// forward(true), redirect(false)
		boolean check = true;
		// URL(path) 담을 변수
		String path = "";

		try {

			if (command.equals("/noticeList")) {
				
				
				ArrayList<NoticeDTO> ar = noticeService.noticeList();
				request.setAttribute("list", ar);
			

				path = "../WEB-INF/views/notice/noticeList.jsp";

			}else if(command.equals("/noticeSelect")) {
				int no = Integer.parseInt(request.getParameter("no"));
				
				NoticeDTO noticeDTO = noticeService.noticeSelect(no);
				request.setAttribute("dto", noticeDTO);
				
				path="../WEB-INF/views/notice/noticeSelect.jsp";
				
			}else if(command.equals("/noticeAdd")) {
				
				if(method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setSubject(request.getParameter("subject"));
					noticeDTO.setContent(request.getParameter("content"));
					noticeDTO.setId(request.getParameter("id"));
					
					int result = noticeService.noticeAdd(noticeDTO);
					check=false;
					path="./noticeList";
					
				}else {
					path = "../WEB-INF/views/notice/noticeAdd.jsp";
				}
			}else if(command.equals("/noticeMod")) {
				if(method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setNo(Integer.parseInt(request.getParameter("no")));
					noticeDTO.setSubject(request.getParameter("subject"));
					noticeDTO.setContent(request.getParameter("content"));
					noticeDTO.setId(request.getParameter("id"));
					int result = noticeService.noticeMod(noticeDTO);
					check=false;
					path="./noticeList";
					
				}else {
					int no = Integer.parseInt(request.getParameter("no"));
					NoticeDTO noticeDTO = noticeService.noticeSelect(no);
					request.setAttribute("dto", noticeDTO);
					path="../WEB-INF/views/notice/noticeMod.jsp";
				}
			}else if(command.equals("/noticeDelete")) {
				int no = Integer.parseInt(request.getParameter("no"));
				
				int result = noticeService.noticeDelete(no);
				
				check=false;
				path="./noticeList";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		} else {
			response.sendRedirect(path);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
