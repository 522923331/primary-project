package iplay.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 52292
 */
@RestController
@RequestMapping("/test")
public class TestController {
    /**
    * 测试方法
    * @param str 入参
    * @return java.lang.String
    * @date 2022/5/13 18:47
    */
    @GetMapping("/getString")
    public String getString(@RequestParam String str){
        System.out.println(str);
        return str;
    }
}
