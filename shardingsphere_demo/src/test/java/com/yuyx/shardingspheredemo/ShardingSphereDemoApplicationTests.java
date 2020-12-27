package com.yuyx.shardingspheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuyx.shardingspheredemo.entity.Course;
import com.yuyx.shardingspheredemo.entity.Order;
import com.yuyx.shardingspheredemo.entity.Udict;
import com.yuyx.shardingspheredemo.entity.User;
import com.yuyx.shardingspheredemo.mapper.CourseMapper;
import com.yuyx.shardingspheredemo.mapper.OrderMapper;
import com.yuyx.shardingspheredemo.mapper.UdictMapper;
import com.yuyx.shardingspheredemo.mapper.UserMapper;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class ShardingSphereDemoApplicationTests {

    @Autowired
    public CourseMapper courseMapper;
    @Autowired
    public UserMapper userMapper;
    @Autowired
    public UdictMapper udictMapper;
    @Autowired
    public OrderMapper orderMapper;

    @RepeatedTest(50)
    public void addCourse() {
        Course course = new Course();
        course.setCname("math");
        course.setUserId(2L);
        course.setCstatus("studying");
        courseMapper.insert(course);
    }

    @Test
    public void getCourses() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 549555230367285248L);

        System.out.println("The One is " + courseMapper.selectOne(wrapper));

//        List<Course> courses = mapper.selectList(null);
//        for (Course cours : courses) {
//            System.out.println(cours);
//        }
    }

    @RepeatedTest(50)
    public void addCourse2() {
        Course course = new Course();
        course.setCname("math");
        course.setUserId((long) new Random().nextInt(10));
        course.setCstatus("studying" + new Random().nextInt(2));
        courseMapper.insert(course);
    }

    @Test
    public void getCourses2() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 549566910082056193L);
        wrapper.eq("user_id", 2);

        System.out.println("The One is " + courseMapper.selectOne(wrapper));

    }

    @RepeatedTest(10)
    public void addUser() {
        User user = new User();
        user.setUsername("lucy");
        user.setUstatus("studying");
        userMapper.insert(user);
    }

    @RepeatedTest(10)
    public void getUsers() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", 549628615780728832L);

        System.out.println("The One is " + userMapper.selectOne(wrapper));
    }

    @Test
    public void addUdict() {
        Udict udict = new Udict();
        udict.setUstatus("b");
        udict.setUvalue("未启用");
        udictMapper.insert(udict);
    }

    @Test
    public void deleteUdict() {
        QueryWrapper<Udict> wrapper = new QueryWrapper<>();
        wrapper.eq("ustatus", "b");
        udictMapper.delete(wrapper);
    }

    @Test
    public void getDicts() {
        QueryWrapper<Udict> wrapper = new QueryWrapper<>();
        wrapper.eq("ustatus", "b");

        System.out.println("The One is " + udictMapper.selectOne(wrapper));
    }

    @Test
    public void addOrder() {
        Order order = new Order();
        order.setOrderId(11L);
        order.setUserId(11L);
        order.setStatus("good");
        orderMapper.insert(order);
    }

    @RepeatedTest(10)
    public void getOrders() {
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        wrapper.eq("order_id", 4L);

        System.out.println("The One is " + orderMapper.selectOne(wrapper));
    }
}
