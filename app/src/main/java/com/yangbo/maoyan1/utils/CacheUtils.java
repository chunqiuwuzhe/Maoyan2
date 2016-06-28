package com.yangbo.maoyan1.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by yangbo on 2016/6/26.
 */
public class CacheUtils {

    public static String getString(Context context, String key) {

        //存储卡存在的话
        if (Environment.getExternalStorageDirectory().equals(Environment.MEDIA_MOUNTED)) {
            String result = "";
            try {
                String fileName = MD5Encoder.encode(key);
                String path = Environment.getExternalStorageDirectory().toString() + "/beijingnews";
                File file = new File(path, fileName);
                if (file.exists()) {
                    //读取文件

                    FileInputStream fis = new FileInputStream(file);

                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int length = -1;
                    while((length = fis.read()) != -1) {
                        baos.write(buffer,0,length);
                    }
                    return baos.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            SharedPreferences sp = context.getSharedPreferences("maoyan", Context.MODE_PRIVATE);

            return sp.getString(key, "");
        }

        return "";
    }


    public static void putString(Context context, String key, String value) {
        //存储卡存在的话
        if (Environment.getExternalStorageDirectory().equals(Environment.MEDIA_MOUNTED)) {

            try {
                String fileName = MD5Encoder.encode(key);
                String path = Environment.getExternalStorageDirectory().toString() + "/beijingnews";
                File file = new File(path, fileName);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }

                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(value.getBytes());

                fos.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            SharedPreferences sp = context.getSharedPreferences("maoyan", Context.MODE_PRIVATE);
            sp.edit().putString(key, value).commit();
        }
    }
}
