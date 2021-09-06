package com.example.springdbstudy.mapper;

import com.example.springdbstudy.model.SalaryModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SalaryMapper {
    List<SalaryModel> getSalary();
}