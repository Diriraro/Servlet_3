package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class NoticeDAO {
	
	public int noticeDelete(int no)throws Exception{
		int result = 0;
		Connection con =DBConnect.getConnect();
		String sql = "DELETE notice WHERE no=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, no);
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	public int noticeMod(NoticeDTO noticeDTO)throws Exception{
		int result =0;
		
		Connection con = DBConnect.getConnect();
		String sql = "UPDATE notice SET subject=?, content=?, today=SYSDATE, hit=hit-1 WHERE no=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getSubject());
		st.setString(2, noticeDTO.getContent());
		st.setInt(3, noticeDTO.getNo());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();		
		
		return result;
		
	}
	
	
	public int noticeAdd(NoticeDTO noticeDTO)throws Exception{
		int result =0;
		
		Connection con = DBConnect.getConnect();
		String sql = "INSERT INTO notice VALUES(notice_no_seq.nextval,?,?,sysdate,?,0)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getSubject());
		st.setString(2, noticeDTO.getContent());
		st.setString(3, noticeDTO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		
		return result;
	}
	
	
	public NoticeDTO noticeSelect(int no)throws Exception{
		NoticeDTO noticeDTO =null;
		Connection con = DBConnect.getConnect();
		String sql = "SELECT * FROM notice WHERE no=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, no);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setNo(rs.getInt("no"));
			noticeDTO.setSubject(rs.getString("subject"));
			noticeDTO.setContent(rs.getString("content"));
			noticeDTO.setToday(rs.getDate("today"));
			noticeDTO.setId(rs.getString("id"));
			noticeDTO.setHit(rs.getInt("hit"));
		}
		
		sql = "UPDATE notice SET hit=hit+1 where no=?";
		st = con.prepareStatement(sql);
		st.setInt(1, no);
		
		st.executeUpdate();
		
		rs.close();
		st.close();
		con.close();
		
		return noticeDTO;
	}

	public ArrayList<NoticeDTO> noticeList() throws Exception {
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		
		Connection con = DBConnect.getConnect();
		String sql = "SELECT * FROM notice ORDER BY no DESC";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNo(rs.getInt("no"));
			noticeDTO.setSubject(rs.getString("subject"));
			noticeDTO.setContent(rs.getString("content"));
			noticeDTO.setToday(rs.getDate("today"));
			noticeDTO.setId(rs.getString("id"));
			noticeDTO.setHit(rs.getInt("hit"));
			ar.add(noticeDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return ar;
	}
}
