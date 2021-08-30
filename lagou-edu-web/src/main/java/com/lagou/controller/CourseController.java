package com.lagou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lagou.entity.Course;
import com.lagou.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: lagou-edu-web
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-09-08 11:22
 * @Description:
 */

@RestController
@RequestMapping("course")
public class CourseController {

    @Reference // 远程消费
    private CourseService courseService;

    @GetMapping("getAllCourse")
    public List<Course> getAllCourse() {
        List<Course> list = courseService.getAllCourse();
        return list;
    }

    @GetMapping("getCourseByUserId/{userid}")
    public List<Course> getCourseByUserId( @PathVariable("userid") String userid ) {
        List<Course> list = courseService.getCourseByUserId(userid);
        return list;
    }

    @GetMapping("getCourseById/{courseid}")
    public Course getCourseById(@PathVariable("courseid")Integer courseid) {
        Course course = courseService.getCourseById(courseid);
        return course;
    }
}
