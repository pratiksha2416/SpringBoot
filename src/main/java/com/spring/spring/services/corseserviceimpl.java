package com.spring.spring.services;

import com.spring.spring.Dao.courseDao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring.entity.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class corseserviceimpl implements  courseserices {
//    List<course> list;

    @Autowired
    private courseDao courseDao;

    public corseserviceimpl(){
//        list=new ArrayList<>();
//        list.add(new course(11,"java","i am java"));
//        list.add(new course(21,"spring boot","i am spring boot"));


    }

    @Override
    public List<course> getcourse(){
        return courseDao.findAll();
    }

    public course getcourseid(long courseid){
//        course c=null;
//        for(course course:list){
//            if(course.getId()==courseid){
//                c=course;
//                break;
//            }
//        }
       return courseDao.getOne(courseid);
    }

    public course add(course course){
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    public course update(course course){
//        list.forEach(e->{
//            if(e.getId()==course.getId()) {
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }


    public void delete(long parseLong){
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
      course entity= courseDao.getOne(parseLong);
      courseDao.delete(entity);
    }

}
