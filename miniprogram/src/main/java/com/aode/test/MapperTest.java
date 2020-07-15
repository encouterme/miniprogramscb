package com.aode.test;


import com.aode.bean.Department;
import com.aode.dao.*;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
 * 测试dao层的工作
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定Spring配置文件的位置
 * 3、直接autowired要使用的组件即可*/



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    ActivitiesMapper activitiesMapper;

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    AnncMapper anncMapper;

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    ImageMapper imageMapper;

    @Autowired
    MessageMapper messageMapper;

    @Autowired
    RegistrationMapper registrationMapper;

    @Autowired
    ReplyMapper replyMapper;

    @Autowired
    SqlSession sqlSession;



    @Test
    public void testCRUD(){
        System.out.println(activitiesMapper);
        System.out.println(adminMapper);
        System.out.println(anncMapper);
        System.out.println(commentMapper);
        System.out.println(departmentMapper);
        System.out.println(imageMapper);
        System.out.println(messageMapper);
        System.out.println(registrationMapper);
        System.out.println(replyMapper);

        //插入部门信息
        //departmentMapper.insertSelective(new Department(null,"JAVA","java，梦想开始的地方","src.department.image01","彭飞琪","1060471057"));
        //修改部门信息
        //departmentMapper.updateByPrimaryKey(new Department(1,"JAVA","语言编程，最强逻辑；高端手法，玩转转盘","src.image.department.01","彭飞琪","1060471057"));

    }

}
