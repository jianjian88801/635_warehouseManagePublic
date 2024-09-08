package com.ken.wms;

import com.ken.wms.security.util.MD5Util;

public class MyTest {
    public static void main(String[] args) {
        // 用户密码（wms_user.USER_PASSWORD）加密规则
        String tempStr = MD5Util.MD5("123456");// 第一次对密码进行加密
        String encryptPassword = MD5Util.MD5(tempStr + "1019");// 第二次对密码进行加密
        //存入数据库的加密密码
        System.out.println(encryptPassword);
    }
}
