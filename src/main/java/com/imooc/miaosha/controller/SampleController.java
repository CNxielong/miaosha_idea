package com.imooc.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: XDragon
 * @Date: 2021/3/31/031 22:52
 * @Email:cnxielong@gmail.com
 */
@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/hello")
    public String thymeleaf(Model model){
        model.addAttribute("name","Xielong");
        return "hello";
    }
}
