package com.sunshine.studyproject.common.mappers;

import com.sunshine.studyproject.common.entities.CommentRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentRecord record);

    int insertSelective(CommentRecord record);

    CommentRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentRecord record);

    int updateByPrimaryKey(CommentRecord record);

    List<CommentRecord> selectByParentId(Integer parentId);
}