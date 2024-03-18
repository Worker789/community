package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)  // 这样就能够以CommunityApplication为配置类进行启动
public class DiscussPostMapperTest {

    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void testListDiscussPostMapper() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);

        for (DiscussPost discussPost : list) {
            System.out.println(discussPost);
        }

        System.out.println(discussPostMapper.selectDiscussPostRows(149));
    }
}
