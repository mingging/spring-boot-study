package com.example.springdbstudy.service;

import com.example.springdbstudy.mapper.SalaryMapper;
import com.example.springdbstudy.model.SalaryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 컨트롤러에서 Mysql에 접근하기 위한 첫 번째 관문
// 싱글톤으로 사용되어야 하기 때문에 @Service 어노테이션을 붙여 Bean 객체로 만든다.
@Service public class SalaryService {
    @Autowired
    public SalaryMapper mapper;

    public List<SalaryModel> getSalary(){
        return mapper.getSalary();
    }
}
