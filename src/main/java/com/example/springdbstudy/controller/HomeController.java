package com.example.springdbstudy.controller;

import com.example.springdbstudy.model.SalaryModel;
import com.example.springdbstudy.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    // get 방식으로 /home 요청을 받았을 때 화면에 Hello Spring Boot 문자열을 출력하는 컨트롤러
    // view를 반환하지 않기 때문에 ResponseBody 사용 -> view 추가 후 삭제
//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String goHome(HttpServletRequest request) {
//        return "content/home";
//    }

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public ModelAndView goHome(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//        List<String> resultList = new ArrayList<String>();
//
//        resultList.add("AAA");
//        resultList.add("BBB");
//        resultList.add("CCC");
//        resultList.add("DDD");
//        resultList.add("FFF");
//
//        mav.addObject("resultList", resultList);
//        mav.setViewName("content/home");
//
//        return mav;
//    }

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public ModelAndView goHome(HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//
//        // salary 객체 리스트 변수
//        List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
//
//        // Salary model
//        SalaryModel salaryModel;
//
//        // 첫번째 데이터
//        salaryModel = SalaryModel.builder()
//                .id(1)
//                .name("AAA")
//                .email("AAA@example.com").build();
//        salaryList.add(salaryModel);
//
//        // 두번째 데이터
//        salaryModel = SalaryModel.builder()
//                .id(2)
//                .name("BBB")
//                .email("BBB@example.com").build();
//        salaryList.add(salaryModel);
//
//        // 첫번째 데이터
//        salaryModel = SalaryModel.builder()
//                .id(3)
//                .name("CCC")
//                .email("CCC@example.com").build();
//        salaryList.add(salaryModel);
//
//        mav.addObject("salaryList", salaryList);
//        mav.setViewName("content/home");
//
//        return  mav;
//    }

    @Autowired
    SalaryService salaryService;

    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        List<SalaryModel> salaryList = salaryService.getSalary();
        mav.addObject("salaryList", salaryList);
        mav.setViewName("content/home.html");
        return mav;
    }
}
