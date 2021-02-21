package com.spring.jdbc;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcDemo {
    public static void main(String[] args) throws Exception{

        //1、注册驱动
//        DriverManager.deregisterDriver(new Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2、获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy?useUnicode=true&characterEncoding=utf8", "root", "root123456");
        //3、获取操作数据库的预处理对象
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from account");
        //4、执行sql，得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        //5、遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("id") + ", name=" + resultSet.getString("name") + ", money=" + resultSet.getFloat("money"));
        }

        //6、释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
