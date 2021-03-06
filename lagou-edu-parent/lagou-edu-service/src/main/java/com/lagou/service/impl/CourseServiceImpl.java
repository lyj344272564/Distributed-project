package com.lagou.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lagou.entity.Course;
import com.lagou.mapper.CourseDao;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @BelongsProject: lagou-edu
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-09-08 16:46
 * @Description:
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    public List<Course> getCourseByUserId(String userId) {
        return courseDao.getCourseByUserId(userId);
    }
    public Course getCourseById(Integer courseid) {
        return courseDao.getCourseById(courseid);
    }
}
