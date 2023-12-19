package com.lsm1998.blog.domain.model.blog;

import com.lsm1998.blog.domain.model.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "blog")
public class Blog extends BaseModel
{
    // 标题
    private String title;

    // 内容
    private String content;

    // 作者
    private String author;

    // 封面
    private String cover;

    // 标签
    private String[] tags;

    // 分类
    private String category;

    // 评论
    private List<Comment> comments;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getCover()
    {
        return cover;
    }

    public void setCover(String cover)
    {
        this.cover = cover;
    }

    public String[] getTags()
    {
        return tags;
    }

    public void setTags(String[] tags)
    {
        this.tags = tags;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public void setComments(List<Comment> comments)
    {
        this.comments = comments;
    }
}
