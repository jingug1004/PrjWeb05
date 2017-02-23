<%--
  Created by IntelliJ IDEA.
  User: macbookpro
  Date: 2017. 2. 5.
  Time: PM 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@include file="../include/header.jsp" %>

<!-- Main content -->
<section class="content">
    <div class="row">
        <!-- left column -->
        <div class="col-md-12">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header">
                    <h3 class="box-title">READ BOARD</h3>
                </div>
                <!-- /.box-header -->

                <form role="form" method="post">

                    <input type='hidden' name='bno' value="${boardVO.bno}">

                </form>

                <div class="box-body">
                    <div class="form-group">
                        <%--@declare id="exampleinputemail1"--%><label for="exampleInputEmail1">Title</label> <input type="text"
                                                                                                                     name='title' class="form-control"
                                                                                                                     value="${boardVO.title}"
                                                                                                                     readonly="readonly">
                    </div>
                    <div class="form-group">
                        <%--@declare id="exampleinputpassword1"--%><label for="exampleInputPassword1">Content</label>
                        <textarea class="form-control" name="content" rows="3"
                                  readonly="readonly">${boardVO.content}</textarea>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Writer</label> <input type="text"
                                                                              name="writer" class="form-control"
                                                                              value="${boardVO.writer}"
                                                                              readonly="readonly">
                    </div>
                </div>
                <!-- /.box-body -->

                <div class="box-footer">
                    <button type="submit" class="btn btn-warning">Modify</button>
                    <button type="submit" class="btn btn-danger">REMOVE</button>
                    <button type="submit" class="btn btn-primary">LIST ALL</button>
                </div>

                <script src="http://code.jquery.com/jquery-latest.js"></script>
                <!--
                [현상] : 눌러도 아무런 동작을 하지 않음. 콘솔창에도 넘어가는 받는 데이터가 없음. 찍히는 값도 확인 안 됐음. ㅠ_ㅠ
                [예상] : 이건(<script>) 다른 소스와 연결된 문제가 없을 것이다 왜냐하면 아무런 데이터를 주고 받는 것이 포착되지 않으니깐.
                [해결] : "1. 스크립트 부분을 헤더에 두지말고 Html 라인 제일 아래에 위치 변경해보세요~" 맨 밑에 위치시켰음!
                "2. 제이쿼리 라이브러리 선언은 하셨나요?" 아니오!!!
                "<script src="http://code.jquery.com/jquery-latest.js"></script>
                스크립트 호출 전에 넣어주시죠. 브라우저에 로딩하는 페이지에 jquery.js 파일이 빠진 듯합니다. " 감사합니다. 이제 되네요. ^^
                "3. 이것도 써보실래요?
                <script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
                " 이것도 됩니다. 감사합니다. 뭐가 더 좋고 뭔 차이가 있는지 알아보고 싶지만 시간이 없어서.. 2번으로 써야겠네요.
                -->
                <script>

                    $(document).ready(function() {

                        var formObj = $("form[role='form']");

                        console.log(formObj);

                        $(".btn-warning").on("click", function(){
                            formObj.attr("action", "/board/modify");
                            formObj.attr("method", "get");
                            formObj.submit();
                        });

                        $(".btn-danger").on("click", function(){
                            formObj.attr("method", "get");
                            formObj.attr("action", "/board/remove");
                            formObj.submit();
                        });

                        $(".btn-primary").on("click", function(){
                            self.location = "/board/listAll";
                        });

                    });

                </script>

            </div>
            <!-- /.box -->
        </div>
        <!--/.col (left) -->

    </div>
    <!-- /.row -->
</section>
<!-- /.content -->

<%@include file="../include/footer.jsp" %>
