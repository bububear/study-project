package com.sunshine.studyproject.common.entities;

import java.util.Date;

public class CommentRecord {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String comment;

    /**
     * 
     */
    private Integer parentid;

    /**
     * 
     */
    private Integer userNo;

    private Date createTime;
    private Date updateTime;

    /**
     * 获取 createTime
     *
     * @return createTime.
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 createTime
     *
     * @param createTime createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 updateTime
     *
     * @return updateTime.
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 updateTime
     *
     * @param updateTime updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     *  comment_record.id 
     *
     * @return the value of comment_record.id
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id 
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     *  comment_record.comment 
     *
     * @return the value of comment_record.comment
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment 
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 
     *  comment_record.parentid 
     *
     * @return the value of comment_record.parentid
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     *
     * @param parentid 
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 
     *  comment_record.user_no 
     *
     * @return the value of comment_record.user_no
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     *
     * @param userNo 
     *
     * @sunshine.generated 2020-12-01 12:38:24
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", comment=").append(comment);
        sb.append(", parentid=").append(parentid);
        sb.append(", userNo=").append(userNo);
        sb.append("]");
        return sb.toString();
    }
}