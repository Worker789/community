package com.nowcoder.community;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)  // 这样就能够以CommunityApplication为配置类进行启动
public class MapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect () {
        System.out.println(userMapper.selectById(101));
        System.out.println(userMapper.selectByName("liubei"));
        System.out.println(userMapper.selectByEmail("nowcoder101@sina.com"));
    }

    @Test
    public void testInsert () {
        User user = new User();
        user.setUsername("123");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        System.out.println(userMapper.insertUser(user));
    }

    @Test
    public void testUpdate () {
        System.out.println(userMapper.updateStatus(101, 1));
        System.out.println(userMapper.updatePassword(101,"hello"));
        System.out.println(userMapper.updateHeader(101, "http://www.nowcoder.com/102.png"));
    }
}
