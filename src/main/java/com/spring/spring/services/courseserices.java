package com.spring.spring.services;

import com.spring.spring.entity.course;

import java.util.List;

public interface courseserices {
    public List<course> getcourse();
    public course getcourseid(long courseid);
    public course add(course course);
    public course update(course course);
    public void delete(long parseLong);

}
