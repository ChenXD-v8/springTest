package com.Chen.springTest01;

import com.Chen.common.OrderLineQueryCondition;
import com.Chen.common.OrderLineQueryResult;
import com.Chen.mapper.OrderHeaderMapper;
import com.Chen.mapper.SysUserMapper;
import com.Chen.pojo.SysUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyTest01 {

    //Person使用ChineseSay实现类
    @Test
    public void testChineseSay(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person.ISay  chineseSay = context.getBean("chineseSay", Person.ISay.class);
        chineseSay.say();
    }
    //Person使用EnglishSay实现类
    @Test
    public void testEnglishSay(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person.ISay  englishSay = context.getBean("englishSay", Person.ISay.class);
        englishSay.say();
    }

    //======================Mybatis小测================================
    @Test
    public void selectOrderLinesByCondition(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OrderHeaderMapper orderHeaderMapper = context.getBean("orderHeaderMapper", OrderHeaderMapper.class);
        //查询条件
        OrderLineQueryCondition condition=new OrderLineQueryCondition();
        condition.setOrderNumber("SO190716000001");        //订单编号
        condition.setOrderLineNumber(10);                  //订单行号
        condition.setItemCode("490");                      //物料编码
        condition.setItemName("卫龙");                      //物料名称
        condition.setCreatedBy(new BigInteger("1"));   //订单创建人id
        condition.setCustomerUserId(new BigInteger("2")); //客户id
        List<OrderLineQueryResult> results = orderHeaderMapper.selectOrderLinesByCondition(condition);
        for (OrderLineQueryResult result : results) {
            System.out.println(result);
        }
    }

    @Test
    public void insertUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SysUserMapper sysUserMapper = context.getBean("sysUserMapper", SysUserMapper.class);
        SysUser user=new SysUser();
        user.setUserNumber("20004");
        user.setUserName("小陈");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setAddress("河北省石家庄市石家庄铁道大学");
        System.out.println("插入用户信息后返回的用户ID为： " +sysUserMapper.insertUser(user));
    }

    @Test
    public void updateUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SysUserMapper sysUserMapper = context.getBean("sysUserMapper", SysUserMapper.class);
        SysUser user=new SysUser();
        user.setUserNumber("20005");
        user.setUserName("陈晓东");
        user.setLastUpdateDate(new Timestamp(new Date().getTime()));
        user.setAddress("河北省石家庄市石家庄铁道大学信息学院");
        user.setUserId(new BigInteger("5"));
        user.setLastUpdatedBy(new BigInteger("5"));
        if(sysUserMapper.updateUser(user)>0){
            System.out.println("更新用户信息成功");
        }else{
            System.out.println("更新用户失败");
        }
    }

    @Test
    public void deleteUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SysUserMapper sysUserMapper = context.getBean("sysUserMapper", SysUserMapper.class);
        System.out.println("删除数据数量为： "+sysUserMapper.deleteUser(5L));
    }

}
