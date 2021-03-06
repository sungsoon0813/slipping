<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/stylesheets/slipp.css" rel="stylesheet">
<title>SLiPP :: Q&A 새글쓰기</title>
<%@ include file="../commons/_header.jspf"%>
</head>

<body>
	<%@ include file="../commons/_top.jspf"%>

	<center>
		<div class="wrapper">
			<div class="content">
				<div class="container">

					<section class="write-content">
					<div class="content-main">
						<h1 class="write-title">새 글 작성</h1>

						<form id="question" class="form-write" action="/questions" method="POST">
							<input id="questionId" name="questionId" type="hidden" value="" />
							<fieldset>
								<div>
									<input id="title" name="title" class="inp-title" placeholder="제목" type="text" value="" size="50" />
								</div>
								<div>
									<textarea id="contents" name="contents" rows="15" cols="80"></textarea>
								</div>
								<div>
									<input id="plainTags" name="plainTags" class="inp-title" placeholder="태그 - 공백 또는 쉼표로 구분 ex) javajigi, slipp" type="text" value="" size="50" />
								</div>
								<div class="submit-write">
									<button type="submit" class="btn-submit">작성완료</button>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="content-sub"></div>
				</div>
			</div>
		</div>
	</center>
</body>
</html>
