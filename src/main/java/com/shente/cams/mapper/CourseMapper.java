package com.shente.cams.mapper;

import com.shente.cams.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {

    Course queryCourseById(@Param("id") Integer id);

    void updateCourseState(@Param("id")Integer id,@Param("newstate") Integer newState);

    void insert(Course course);

    List<Course> queryCourseByUserIdAndName(@Param("id") Integer id,@Param("name") String name);
}
