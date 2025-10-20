package com.skc.crud_proj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.skc.crud_proj.domain.Student;

@Mapper
public interface StudentMapper {

	List<Student> findAll();

}
