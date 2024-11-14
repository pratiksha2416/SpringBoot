package com.spring.spring.controller;

import com.spring.spring.entity.course;
import com.spring.spring.services.courseserices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private courseserices coursesrices;

    @GetMapping("/home")
    public String home(){
        return "i am in home";
    }


    @GetMapping("/course")
    public List<course> getcourse(){
        return  this.coursesrices.getcourse();
    }

    @GetMapping("/course/{courseid}")
    public course getcourseid(@PathVariable String courseid){

        return this.coursesrices.getcourseid(Long.parseLong(courseid));
    }

    @PostMapping("/course")
    public course add(@RequestBody course course){
       return this.coursesrices.add(course);
    }

    @PutMapping("/put/{courseid}")
    public course update(@RequestBody course course){
        return this.coursesrices.update(course);
    }

    @DeleteMapping("/course/{courseid}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String courseid){
        try{
            this.coursesrices.delete(Long.parseLong(courseid));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


