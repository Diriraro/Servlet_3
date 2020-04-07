# Servlet_3

## 기능 
- point list 출력
- point 등록
- point 하나 상세 정보 출력
- point 수정
- point 삭제

## JSP
- pointList.jsp		: List 출력
- pointAdd.jsp		: 입력 폼
- pointSelect.jsp	: point 하나 상세 정보 출력
- pointMod.jsp		: point 수정 폼

## URL 주소			/	JSP				/	method
### /WEB-INF/views/point/**
- /point/pointList 	/	pointList.jsp	/	get
- /point/pointAdd	/	pointAdd.jsp	/	get
- /point/pointAdd	/					/	post
- /point/pointSelect/	pointSelect.jsp	/	get
- /point/pointMod	/	pointMod.jsp	/	get
- /point/pointMod	/					/	post
- /point/pointDelete/					/	get
