package com.xunyun.infanteduplatform.controller.oauth;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.oauth.Oauth;
import com.xunyun.infanteduplatform.service.AccountLoginService;
import com.xunyun.infanteduplatform.service.LoginUserService;
import com.xunyun.infanteduplatform.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 第三方登录方法
 * Created by Pooh on 2015/12/29.
 */
@Controller @RequestMapping(value = "accountLogin") public class AccountLoginController {

    @Autowired public AccountLoginService accountLoginService;
    @Autowired private LoginUserService loginUserService;
    @Autowired private RegisterService registerService;

    @RequestMapping(value = "/qqLogin")
    public void qqLogin(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        try {
            response.sendRedirect(new Oauth().getAuthorizeURL(request));
        } catch (QQConnectException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/qqAfterLogin")
    public ModelAndView qqAfterLogin(HttpServletRequest request, HttpServletResponse response)
        throws IOException, NoSuchMethodException {
        //session 保存用户name，后期需要其他字段，可以继续添加
        HttpSession session = request.getSession();
        try {
            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);

            String accessToken = null,
                openID = null;
            long tokenExpireIn = 0L;
            if (!accessTokenObj.getAccessToken().equals("")) {
                //                我们的网站被CSRF攻击了或者用户取消了授权
                //                做一些数据统计工作
                System.out.print("没有获取到响应参数");
            } else {
               /* accessToken = accessTokenObj.getAccessToken();
                tokenExpireIn = accessTokenObj.getExpireIn();
                request.getSession().setAttribute("access_token", accessToken);
                request.getSession().setAttribute("token_expirein", String.valueOf(tokenExpireIn));*/

                // 利用获取到的accessToken 去获取当前用的openid -------- start
                OpenID openIDObj = new OpenID("EF66708202CF0BF73425C7EFA6247F20");
                openID = openIDObj.getUserOpenID();
                request.getSession().setAttribute("openid", openID);
                // 利用获取到的accessToken 去获取当前用户的openid --------- end

                /**
                 * 暂定代码
                 * 1.根据openid去数据库查询是否存在
                 * 存在----> 调用查询用户并往session里面塞值 -->登录页面
                 * 不存在---> 新建用户 -->登录
                 */
                accountLoginService.accountRegister(openID, "qqdenglu",request);

            }
        } catch (QQConnectException e) {
            System.out.println("qq登录连接失败");
        }
        return new ModelAndView("pages/dataTables");
    }



}
