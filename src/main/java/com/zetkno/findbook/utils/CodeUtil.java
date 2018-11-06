package com.zetkno.findbook.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CodeUtil {
    /**
     * 将获取到的参数转为String类型
     * @param key 与页面中验证码的name值一致
     * @param request
     */
    public static String getString(HttpServletRequest request, String key) {

        String result = null;
        try {
            result = request.getParameter(key);

        if (result != null) {
            result = result.trim();
        }
        if ("".equals(result)) {
            result = null;
        }
        return result;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 验证码校验
     */
    public static boolean checkVerifyCode(HttpServletRequest request) {
        //        获取生成的验证码
        String verifyCodeExpected = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        System.out.println("生成的验证码：" + verifyCodeExpected);
//      获取用户输入的验证码  key值与页面的验证码name值一致
        String verifyCodeActual = CodeUtil.getString(request, "verifyCodeActual");
        if (verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExpected)) {
            return false;
        }
        return true;

    }
}
