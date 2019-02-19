package com.rong.blog.mapper;

import com.rong.blog.pojo.AcTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcTagMapper {
    List<AcTag> findAll();

//    public int save(AcTag acTag);

//    public void delete(int id);

//    public AcTag get(int id);

//    public int update(AcTag acTag);
}
