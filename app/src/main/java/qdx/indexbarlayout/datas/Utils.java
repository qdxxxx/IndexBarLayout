package qdx.indexbarlayout.datas;


import android.app.Activity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

    public CarBean readFromAssets(Activity activity) {
        CarBean carBean = null;
        try {
            InputStream is = activity.getAssets().open("cars.json");//此处为要加载的json文件名称
            String text = readTextFromSDcard(is);
            carBean = new Gson().fromJson(text, CarBean.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return carBean;
    }

    //将传入的is一行一行解析读取出来出来
    private String readTextFromSDcard(InputStream is) throws Exception {
        InputStreamReader reader = new InputStreamReader(is, "utf-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder buffer = new StringBuilder();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            buffer.append(str);
        }
        return buffer.toString();//把读取的数据返回
    }
}
