package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.NewsMapper;
import com.fby.dbs.mapper.StudentMapper;
import com.fby.dbs.mapper.TeacherMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.News;
import com.fby.dbs.model.entity.Student;
import com.fby.dbs.model.entity.Teacher;
import com.fby.dbs.model.vo.NewsVo;
import com.fby.dbs.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewsMapper newsMapper;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private TeacherMapper teacherMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(News record) {
        return newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record) {
        return newsMapper.insertSelective(record);
    }

    @Override
    public ResultDto selectByPrimaryKey(Integer id) {
        News news = newsMapper.selectByPrimaryKey(id);

        NewsVo newsVo=newsConvertNewsVo(news);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(newsVo);
        return resultDto;
    }

    private NewsVo newsConvertNewsVo(News news) {
        NewsVo newsVo = new NewsVo();
        Student student = studentMapper.selectByPrimaryKey(news.getPostManId());

        Teacher teacher = teacherMapper.selectByPrimaryKey(news.getNewsAuditorId());

        newsVo.setDispatchTime(news.getDispatchTime());
        newsVo.setId(news.getId());
        newsVo.setNewsDetail(news.getNewsDetail());
        newsVo.setNewsProfile(news.getNewsProfile());
        newsVo.setNewsTitle(news.getNewsTitle());
        newsVo.setReadingQuantity(news.getReadingQuantity());
        newsVo.setStudent(student);
        newsVo.setNewsAuditor(teacher);

        return newsVo;
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return newsMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<News> arrayList = newsMapper.selectByAnyCondition(new News());

        PageInfo pageInfo=new PageInfo(arrayList);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    @Override
    public ResultDto selectTop5() {
        ArrayList<News> news=newsMapper.selectTop10();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(news);
        return resultDto;
    }

    @Override
    public ResultDto selectTotalCount() {
        Integer count=newsMapper.selectTotalCount();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(count);
        return resultDto;
    }

}


