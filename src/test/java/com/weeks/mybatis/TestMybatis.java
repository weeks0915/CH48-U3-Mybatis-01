package com.weeks.mybatis;

import com.weeks.dao.UserinfoMapper;
import com.weeks.entity.Userinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void TestConn(){
        // 1. 核心配置文件的位置
        String confPath = "mybatis-config.xml";
        // 2. 通过流的方式去读取这个配置文件
        // Unhandled exception: java.io.IOException
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(confPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3. 通过会话工厂构建器（SqlSessionFactoryBuilder）来构建一个会话工厂（SqlSessionFactory）
        // 设计模式23-工厂模式
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 4. 通过会话工厂（SqlSessionFactory）的到一个会话（SqlSession）
        // 设计模式23种-单例模式
        SqlSession session = sessionFactory.openSession();

        // 5. 通过会话（SqlSession）获取Dao层接口的对象/实例
        // 装饰模式
        UserinfoMapper userinfoMapper = session.getMapper(UserinfoMapper.class);
        // 6. 通过接口的实例化对象调用方法
        List<Userinfo> list = userinfoMapper.getUserinfoAll();
        list.forEach(System.out::println);
    }
}
