package org.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @RequestMapping(value = "/hello")
    public String getUser(){
        System.out.println("this is miss lee");
        return "hello";
    }

    @RequestMapping(value = "/params",params = {"username","age=10","!sex=1"})
    //@RequestMapping(value = "/params")
    public String getParams(){
        System.out.println("this params is been");
        return "hello";
    }

    /**
     * @PathVariable占位符的使用
     */
    @RequestMapping(value = "/path/{id}")
    public String  getPathVariable(@PathVariable(value = "id") Integer id){
        System.out.println("占位成功"+"====="+id);
        return "hello";
    }

    @RequestMapping(value = "/list")
    public String getRequestParam
            (@RequestParam(value = "page",required = false,defaultValue = "34") Integer page)
    {
        System.out.println("得到的pageList"+"-----"+page);
        return "hello";
    }

    /**
     * @return
     */
    @RequestMapping(value = "/username")
    public String getString(String username){
        System.out.println("username==="+username);
        return "hello";
    }

    @RequestMapping("/headers")
    public String getHeaders(@RequestHeader(value = "Pragma") String Pragma ){

        System.out.println("Pragma=="+Pragma);
        return "hello";
    }



}
