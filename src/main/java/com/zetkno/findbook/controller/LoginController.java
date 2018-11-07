package com.zetkno.findbook.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.zetkno.findbook.pojo.User;
import com.zetkno.findbook.service.UserService;
import com.zetkno.findbook.utils.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;

@RestController
public class LoginController {


    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        if (!CodeUtil.checkVerifyCode(request)) {
            return "验证码错误";
        } else {
            return "hello，world";
        }
    }

    @Autowired
    private Producer kaptchaProducer;

    @Autowired
    private UserService userService;

//    生成验证码
    @RequestMapping("/kaptcha")
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
//        生产验证码
        String kapText = kaptchaProducer.createText();
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, kapText);
//        向客户端写出
        BufferedImage bi = kaptchaProducer.createImage(kapText);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(HttpServletRequest request, HttpServletResponse response) {

        JSONObject flag = new JSONObject();

        if (!CodeUtil.checkVerifyCode(request)) {
            flag.put("flag", false);
            flag.put("error", "验证码有误");
            return flag;
        } else {
            flag.put("flag", true);
            flag.put("msg", "验证码正确");
        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (!userService.checkUser(username)) {

            flag.put("flag", false);
            flag.put("error", "用户不存在！");
        }else {
            User user = userService.getUserByUsername(username);
            String passwordReslt = user.getPassword();
            System.out.println("数据库的用户密码: " + passwordReslt);
            if (password.equals(passwordReslt)) {
                flag.put("flag", true);
                flag.put("msg","登录成功");
            } else {
                flag.put("flag", false);
                flag.put("error", "密码错误！");
            }
        }
        return flag;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "index";
    }

}
