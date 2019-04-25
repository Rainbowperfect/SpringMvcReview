package org.person.controller;


import org.person.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author RainbowPerferct
 */

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String getItem(){
        System.out.println("来到了Item_add的页面");
        return "item_add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String getItemContent(Item item){

        System.out.println("Item的表单"+item);
        return "item_add";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String deleteAry(Integer[] ids){

        System.out.println("来到了====");
        for (int i = 0; i < ids.length; i++) {
            System.out.println("要delete的数据==="+ids[i]);
        }

        return "item_add";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String getList(Item item){
        System.out.println("需要测试的list"+item);
        return "item_add";
    }

    @RequestMapping(value = "/model",method = RequestMethod.GET)
    public String  getMode(Model model,Item item){

        item.setId(343L);
        item.setPrice(4343L);
        item.setTitle("商品的价格");

        model.addAttribute("item",item);

        return "item_add";
    }


    @RequestMapping("/forward")
    public void getForward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("进入请求转发的请求指令");
        request.getRequestDispatcher("/WEB-INF/view/item_add.jsp").forward(request,response);
    }

    @RequestMapping("/redirect")
    public void getRedirect(HttpServletResponse response,HttpServletRequest request)
    throws ServletException ,IOException {

        System.out.println("进入重定向的请求指令");
        response.sendRedirect("/hello.jsp");
    }

    @RequestMapping("/redirecting")
    public String getRedirecting(){
        System.out.println("进入注解重定向");
        return "redirect:/hello.jsp";
    }

    @RequestMapping("/forwarding")
    public String  getForwarding(){
        System.out.println("进入注解的请求转发");
        return "forward:/WEB-INF/view/item_add.jsp";
    }
}
