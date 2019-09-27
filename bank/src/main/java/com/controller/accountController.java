package com.controller;


import com.pojo.Account;
import com.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/account")
public class accountController {

    @Autowired
    private accountService accountService;

    @RequestMapping("/login")
    public String login(String username, String pwd, HttpSession session, Model model){
        String msg="";
        Account account = accountService.login(username);
        System.out.println(account);
        System.out.println(account.getBalance());
        System.out.println(account.getCardNo());
        if (account!=null){
            if (account.getPassword().equals(pwd)){
                if(account.getStatus()==1){
                session.setAttribute("account",account);
                    return "index2";
                }else {
                    msg = "该用户已冻结";
                }
            }else{
                msg="密码错误";
            }
        }else{
            msg="无该用户";
        }
        model.addAttribute("msg",msg);
        return "login";
    }
    @RequestMapping("toBalance")
    public String toBalance(Model model){
        model.addAttribute("page","balance");
        return "index2";
    }
    @RequestMapping("toModify")
    public String toModify(Model model){
        model.addAttribute("page","modify");
        return "index2";
    }
    @RequestMapping("modifyPwd")
    public String modifyPwd(String username,String pwd){
        System.out.println(pwd);
        System.out.println(username);
        if(accountService.modifyPwd(username,pwd)==true){
        return "redirect:../index.jsp";
        }
        else{
            return "index2";
        }
    }

    @RequestMapping("toTransfer")
    public String toTransfer(Model model){
        model.addAttribute("page","transfer");
        return "index2";
    }

    @RequestMapping("transfer")
    public String transfer(@RequestParam("money") double money,@RequestParam("cardNo") String cardNo,@RequestParam("myCard") String myCard, Model model){
        System.out.println(money+" "+cardNo+" "+ myCard);
        HashMap map=accountService.transfer(money,cardNo,myCard);
        String msg=(String)map.get("msg");
        System.out.println("msg"+msg);
        int code=(int)map.get("code");
        System.out.println("code"+code);
        model.addAttribute("code",code);
        model.addAttribute("msg2",msg);
        model.addAttribute("page","transfer");
        return "index2";
    }


}
