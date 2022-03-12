package com.pink.dao;

import com.pink.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIf(Map<String,String> map);

    List<Blog> queryBlogChoose(Map<String,String> map);

    List<Blog> queryBlogTrim(Map<String,String> map);

    int updateBlogSet(Map<String,String> map);

    //查询id为 1-2-3 的博客
    List<Blog> queryBlogForeach(Map<String,Object> map);
}
