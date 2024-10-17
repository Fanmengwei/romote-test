package com.fmw.community.dao;

import com.fmw.community.entity.DiscussPost;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param用于给参数起别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
