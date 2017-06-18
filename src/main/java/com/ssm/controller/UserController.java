package com.ssm.controller;

import com.ssm.model.Admin;
import com.ssm.model.User;
import com.ssm.service.AdminService;
import com.ssm.service.UserService;
import com.ssm.util.Page;
import com.ssm.util.SeeRecord;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;



@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;


    @Resource
    private  AdminService adminService;
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        for(int i=0;i<userList.size();i++)
        {
            User user= userList.get(i);
            System.out.println("第"+i+"个值="+user.getId());
        }
        return "showUser";
    }
    @RequestMapping("/showAdmin")
    public String showAdmin(HttpServletRequest request, Model model, SeeRecord seeRecord, String pageNow){
        log.info("查询所有管理信息");
        Page page = null;//new 对象在下面
        int totalCount = adminService.getCount();//获取当前用户总记录条数
        if(pageNow != null && pageNow != "") {//防止出现空指针异常
            int pageNow1 = Integer.parseInt(pageNow);
            page = new Page(totalCount, pageNow1);//这样写的好处，判断完成外面可以继续调用
        }
        seeRecord.setPage(page);
        model.addAttribute("page",page);
        List<Admin> adminList = adminService.queryAllAdmin(seeRecord);
        model.addAttribute("adminList",adminList);
        /*for(int i=0;i<adminList.size();i++)
        {
            Admin admin= adminList.get(i);
            System.out.println("第"+i+"个值="+admin.getId());
        }*/
        return "showAdmin";
    }


}
