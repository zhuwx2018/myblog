package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.NoteInfo;
import com.mybatisex.myblog.domain.NoteInfoExample;
import com.mybatisex.myblog.util.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteInfoMapper extends BaseMapper<NoteInfo> {
    int countByExample(NoteInfoExample example);

    int deleteByExample(NoteInfoExample example);

    List<NoteInfo> selectByExampleWithBLOBs(NoteInfoExample example);

    List<NoteInfo> selectByExample(NoteInfoExample example);

    int updateByExampleSelective(@Param("record") NoteInfo record, @Param("example") NoteInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") NoteInfo record, @Param("example") NoteInfoExample example);

    int updateByExample(@Param("record") NoteInfo record, @Param("example") NoteInfoExample example);
}