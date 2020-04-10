package com.iu.notice;

import java.util.ArrayList;

public class NoticeService {
	
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		noticeDAO = new NoticeDAO();
	}
	
	public int noticeDelete(int no) throws Exception{
		return noticeDAO.noticeDelete(no);
	}
	
	public int noticeMod(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.noticeMod(noticeDTO);
	}
	
	public int noticeAdd(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.noticeAdd(noticeDTO);
	}
	
	public NoticeDTO noticeSelect(int no) throws Exception{
		return noticeDAO.noticeSelect(no);
	}
	
	public ArrayList<NoticeDTO> noticeList() throws Exception {
		return noticeDAO.noticeList();
	}

}
