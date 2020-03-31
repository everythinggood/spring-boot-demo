package controller;

import config.CASAutoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CasController {

    @Value("${casClientLogoutUrl}")
    private String casClientLogoutUrl;

    @RequestMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name", "clien A");
        return "index";
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        //使用cas退出成功后,跳转到http://cas.client1.com:9003/logout/success
        return "redirect:"+casClientLogoutUrl;

    }
    @RequestMapping("logout/success")
    public String logoutsuccess(HttpSession session) {
        return "logoutsuccess";
    }
}
