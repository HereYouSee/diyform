<%--
  Created by IntelliJ IDEA.
  Date: 17-5-10
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="jquery-ui-1.9.2.custom/css/base/jquery-ui-1.9.2.custom.css">
    <script src="jquery-ui-1.9.2.custom/js/jquery-1.8.3.js"></script>
    <script src="jquery-ui-1.9.2.custom/js/jquery-ui-1.9.2.custom.js"></script>
    <script src="layer-v1.8.5/layer/layer.min.js" ></script>
</head>
<body>
<div style="width: 300px;margin: 0 auto;">
    <table id="sortable" style="text-align: center;">
        <tr recordid="1">
            <td>AAAAA</td>
            <td>11111</td>

        </tr>
        <tr recordid="2">
            <td>BBBBB</td>
            <td>22222</td>
        </tr>
        <tr recordid="2">
            <td>CCCCC</td>
            <td>33333</td>
        </tr>
        <tr recordid="4">
            <td>DDDD</td>
            <td>44444</td>
        </tr>
        <tr recordid="5">
            <td>EEEE</td>
            <td>5555</td>
        </tr>

    </table>

</div>


</body>
<script>
    $(function() {
        $( "#sortable" ).sortable({
            cursor: "move",
            items: "tr", //只是tr可以拖动
            opacity: 0.6, //拖动时，透明度为0.6
            revert: true,//释放时，增加动画
            update:function (event,ui) {
                var categoryids = $(this).sortable("toArray");
                var $this = $(this);
                alert(categoryids);
                alert($this);
                layer.msg("aaaa");
            }
        });
        $("#sortable").disableSelection();
    });
</script>
</html>
