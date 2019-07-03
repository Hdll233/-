$(function(){
    $("#login").click(function () {
        var account = $("#account").val();
        var password = $("#password").val();

        $.post(
            "/login",
            {"account":account, "password":password},
            function (date) {
                if (date == "") {
                    alert("账号密码错误");
                    return;
                }

                alert("登录成功,账号为："+date.account);
                window.location.href="/index";

            }
        )}
    )
});

