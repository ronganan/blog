package com.rong.blog.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rong.blog.mapper.AcTagMapper;
import com.rong.blog.mapper.AcTypeMapper;
import com.rong.blog.pojo.AcTag;
import com.rong.blog.pojo.AcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/common")
public class CommonController {
    @Autowired
    private AcTypeMapper acTypeMapper;

    @Autowired
    private AcTagMapper acTagMapper;

    @RequestMapping(value = "/getAcTypes", method = RequestMethod.GET)
    public List<AcType> getAcType() {
        List<AcType> ats = new ArrayList<>();
        ats = acTypeMapper.findAll();
        return ats;
    }

    @RequestMapping(value = "/getAcTags", method = RequestMethod.GET)
    public List<AcTag> getAcTag() {
        List<AcTag> ats = new ArrayList<>();
         ats = acTagMapper.findAll();
        return ats;
    }

}
