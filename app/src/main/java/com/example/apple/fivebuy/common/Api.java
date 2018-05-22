package com.example.apple.fivebuy.common;

/**
 * Created by apple on 2018/5/18.
 */

public interface Api {

     String HOST="http://api.anwenqianbao.com/v2/";

    /**banner **/
    String BANNER=HOST+"vest/banner";
    /**产品 **/
     String PRODUCT_LSIT=HOST+"vest/product";
    /**福利 **/
    String WELFARE=HOST+"vest/welfare";

    interface   LOGIN{
        /** 新or老用户**/
        String  isOldUser=HOST+"quick/isOldUser";
        /** 验证码获取**/
        String  CODE=HOST+"sms/getcode";
        /** 验证码效验**/
        String  CHECKCODE=HOST+"sms/checkCode";
        /** 登陆**/
        String  QUICKLOGIN=HOST+"quick/login";
        /** 完善信息**/
        String IDENTITY =HOST+"quick/addBasicIdentity";

    }

    interface  STATUS{
        /** 状态**/
        String getStatus=HOST+"vest/getStatus";
    }





}