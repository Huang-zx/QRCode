package com.hzx;

import com.hzx.util.QRCodeUtil;

import java.io.File;

/**
 * Created by Huangzx
 * Data: 2020/9/3
 * Time: 17:53
 */
public class QRCodeApplication {
    public static void main(String[] args) throws Exception {
        String text = "http://www.baidu.com";
        String destPath = "QR"+ File.separator+System.currentTimeMillis()+".jpg";
        QRCodeUtil.encode(text,null,destPath,true);

        String str = QRCodeUtil.decode(destPath);

        System.out.println(str);

    }
}
