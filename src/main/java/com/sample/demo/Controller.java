package com.sample.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.projectoth.util.LogExecutionTime;
//import com.projectoth.util.LogUtil;

import java.util.Map;

@RestController
public class Controller {

    @PostMapping("/test")
    //@LogExecutionTime
    public String test(@RequestBody Map<String, String> input) {


        //LogUtil.
        return "success";
    }


}
