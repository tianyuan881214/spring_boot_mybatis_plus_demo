package com.example.simple_demo;



import com.example.simple_demo.dao.UserMapper;
import com.example.simple_demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void testUser() {
        List<User> list = userMapper.selectList(null);
        assertEquals(5, list.size());
        list.forEach(System.out::println);
    }

}
