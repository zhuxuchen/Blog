package com.ly.blogapi.service;

import com.ly.blogapi.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.blogapi.vo.Result;

/**
* @author zhuxuchen
* @description 针对表【ms_comment】的数据库操作Service
* @createDate 2023-03-09 10:47:49
*/
public interface CommentService extends IService<Comment> {

    /**
     * 根据文章id查询评论列表
     * @param id 文章id
     * @return com.ly.blogapi.vo.Result
     */
    Result commentsByArticleId(Long id);
}
