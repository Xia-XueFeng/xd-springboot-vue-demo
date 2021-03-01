package com.xxf.xdspringbootvuedemo.mapper;


import com.xxf.xdspringbootvuedemo.model.entity.PlayRecord;
import org.apache.ibatis.annotations.Param;

public interface PlayRecordMapper {


    int saveRecord(PlayRecord playRecord);

}
