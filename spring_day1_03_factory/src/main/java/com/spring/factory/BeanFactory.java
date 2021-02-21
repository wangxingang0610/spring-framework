package com.spring.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties;

    private static Map<String,Object> map;

    static {
        try {
            properties = new Properties();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(inputStream);

            map = new HashMap<>();
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String value = properties.getProperty(key);
                Object o = Class.forName(value).newInstance();
                map.put(key,o);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Object getBean(String beanName){
        Object obj = null;
        try{
            obj = map.get(beanName);
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }

//    public static Object getBean(String beanName){
//        Object obj = null;
//        try{
//            String path = (String) properties.get(beanName);
//            obj = Class.forName(path).newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return obj;
//    }
}
