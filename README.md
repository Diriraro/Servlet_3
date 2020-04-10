# Servlet_3



####
- 공지사항(Notice) 게시판
- 글쓰기, 수정, 삭제 id가 admin만 가능
- 글 리스트 페이지. 최신순으로 출력
- 리스트페이지에서 글쓰기 버튼을 누리면 글쓰기 이동
- 리스트페이지에서 글 제목을 누르면 글 상세 보기로 이동
- 글 상세보기에서 글 수정, 글 삭제버튼 존재
- 글 삭제버튼을 누르면 확인, 취소 창을 띄우고 확인을 누르면 삭제
- 글 수정 누르면 글수정 이동
- fnc 샘플 사이트 참고하여 만들기
- [option] 조회수, 글 상세보기하면 조회수 1 증가

###
URL
/notice/noticeList		noticeList.jsp		GET
/notice/noticeAdd		noticeAdd.jsp		GET
/notice/noticeAdd							POST
/notice/noticeSelect	noticeSelect.jsp	GET
/notice/noticeMod		noticeMod.jsp		GET
/notice/noticeMod							POST
/notice/noticeDelete						GET



## 기능

### Member
- 회원가입(Insert)
- 로그인(select One)
- 회원수정(Update)
- 회원탈퇴(Delete)
- myPage

## JSP
- /WEB-INF/views/member/...

URL
/member/memberJoin		memberJoin.jsp		GET
/member/memberJoin							POST
/member/memberLogin		memberLogin.jsp		GET
/member/memberLogin							POST
/member/memberPage		memberPage.jsp		GET
/member/memberUpdate	memberUpdate.jsp	GET
/member/memberUpdate						POST
/member/memberDelete						GET


### point
- point list 출력
- point 등록
- point 상세 정보 출력
- point 수정
- point 삭제

## JSP
- pointList.jsp 	: List 출력
- pointAdd.jsp		: 입력폼
- pointSelect.jsp	: point 상세정보 출력
- pointMod.jsp		: point 수정 폼

## URL 주소			/	JSP				/ Method
### /WEB-INF/views/point/**
- /point/pointList	/	pointList.jsp	/ GET
- /point/pointAdd	/	pointAdd.jsp	/ GET
- /point/pointAdd	/					/ POST
- /point/pointSelect/	pointSelect.jsp / GET
- /point/pointMod	/	pointMod.jsp	/ GET
- /point/pointMod	/					/ POST
- /point/pointDelete/					/ GET

 
