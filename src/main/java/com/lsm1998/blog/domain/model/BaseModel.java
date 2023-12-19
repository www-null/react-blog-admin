package com.lsm1998.blog.domain.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable
{
    // 主键
    @Id
    private String id;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
}
