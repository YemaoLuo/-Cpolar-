package com.example.demo.mapper;
/*
  User: Yemao Luo
  Date: 2022/2/2
  Time: 13:20
*/


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.url;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UrlMapper extends BaseMapper<url> {
}
