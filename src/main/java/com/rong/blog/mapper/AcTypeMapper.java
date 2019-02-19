package com.rong.blog.mapper;

import com.rong.blog.pojo.AcType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcTypeMapper {

    List<AcType> findAll();

//    public int save(AcType acType);

//    public void delete(int id);

//    public AcType get(int id);

//    public int update(AcType acType);
}
