package com.sunshine.studyproject;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.sunshine.studyproject.common.entities.CommentRecord;
import com.sunshine.studyproject.common.mappers.CommentRecordMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = StudyProjectApplication.class)
public class StudyProjectApplicationTests {
    @Autowired
    private CommentRecordMapper commentRecordMapper;

    @Test
    public void parseJson(){
        List<String> list  = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list.addAll(list2);
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        Map<String,Object> map  = commentRecordMapper.selectMapByIds(collect);


    }

    @Test
    public void contextLoads() {
        Integer parentId = 2;
        deleteById(1);
        deleteById(2);
        deleteById(3);
        deleteById(4);
        deleteById(5);
        // CollectionUtils
        // StringUtils
        // DateUtil
    }

    private boolean deleteById(Integer id) {
        ArrayList<Integer> idList = new ArrayList<>();
        //存入超级父级id
        idList.add(id);
        // 递归查询次级id 存入 IdList 集合
        List<Integer> childIds = getChildIds(idList, id);
        System.out.println(Arrays.toString(idList.toArray()));
        System.out.println(Arrays.toString(childIds.toArray()));
        return false;
    }

    /**
     * 递归函数
     *
     * @param idList 待删除集合
     * @param id     次级的parentID，当前层级的 ID
     */
    private List<Integer> getChildIds(ArrayList<Integer> idList, Integer id) {
        List<CommentRecord> commentRecords = commentRecordMapper.selectByParentId(id);
        for (CommentRecord record : commentRecords) {
            Integer recordId = record.getId();
            // 存入当层的id
            idList.add(recordId);
            // 递归（当层id为次级parentId）
            getChildIds(idList, recordId);
        }
        return idList;
    }


}
