package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnect;

public class MemberDAO {
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		int result = 0;
		
		Connection con = DBConnect.getConnect();
		String sql = "UPDATE member SET name=?, email=?, phone=?, age=? WHERE id=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
//		st.setString(1, memberDTO.getPw());
		st.setString(1, memberDTO.getName());
		st.setString(2, memberDTO.getEmail());
		st.setString(3, memberDTO.getPhone());
		st.setInt(4, memberDTO.getAge());
		st.setString(5, memberDTO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		int result =0;
		
		Connection con = DBConnect.getConnect();
		String sql = "DELETE member WHERE id=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		
		Connection con = DBConnect.getConnect();
		String sql ="SELECT * FROM member WHERE id=? and pw=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
			memberDTO.setAge(rs.getInt("age"));
		}else {
			memberDTO =null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
		
	}

	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result =0;
		
		Connection con = DBConnect.getConnect();
		String sql = "INSERT INTO member VALUES(?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getEmail());
		st.setString(5, memberDTO.getPhone());
		st.setInt(6, memberDTO.getAge());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
}
