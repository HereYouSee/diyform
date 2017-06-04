<%--
  Created by IntelliJ IDEA.
  User: zmm
  Date: 17-5-31
  Time: 下午9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-ui-1.9.2.custom/js/jquery-1.8.3.js"></script>
</head>
<body>

</body>
<script>
    var url = "";
    var jqxhr = $.ajax({
        url : url,
        type : "GET",
        cache : true,
        data : {},
        dataType : "json",
        jsonp:"callback",
        stautsCode:{
            404 : hanlder404,
            500 : hanlder500

        }
    });

    jqxhr.done(successHanlder);
    jqxhr.fail(failureHandler);


  /*  $('#myClick').on("click.myClick",myEventHandler);
    $('#myClick').unbind("click.myClick");*/


  var sb = [];
  for(var i=0; i<10000; i++) {
      sb[i] = "<li>"+i+"</li>";
  }

  sb.join("");

</script>
</html>
