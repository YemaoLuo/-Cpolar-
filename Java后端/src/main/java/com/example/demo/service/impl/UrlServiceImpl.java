package com.example.demo.service.impl;
/*
  User: Yemao Luo
  Date: 2022/2/2
  Time: 13:21
*/

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.url;
import com.example.demo.mapper.UrlMapper;
import com.example.demo.service.UrlService;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl extends ServiceImpl<UrlMapper, url> implements UrlService {
}
