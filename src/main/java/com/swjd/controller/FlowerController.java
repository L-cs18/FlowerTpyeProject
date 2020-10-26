package com.swjd.controller;

import com.swjd.bean.Flower;
import com.swjd.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/flowerController")
public class FlowerController {
    @Autowired
    FlowerService flowerService;
    /*跳转到主页*/
    @RequestMapping("/index")
    public String index(Model model){
        List<Flower> list=flowerService.getAll();
        model.addAttribute("list",list);

        return "index";
    }
    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("flower",new Flower());
        return "add";
    }
    @RequestMapping("/doAdd")
    public String doAdd(Flower flower,Model model){
        int jg=flowerService.addFlower(flower);
        List<Flower> list=flowerService.getAll();
        model.addAttribute("list",list);
        model.addAttribute("flower",new Flower());
        if (jg==0){
            return "index";
        }
        return "index";
    }
    @RequestMapping("/index1")
    public String index1(Model model, ModelMap modelMap, String typename){
        if (typename.equals("0")){
            return "redirect:/flowerController/index";
        }else {
            List<Flower> list=flowerService.getType(typename);
            model.addAttribute("list",list);
            modelMap.addAttribute("flower1",new Flower());
            return "index";
        }

    }
    @RequestMapping("/main")
    public String image(Model model){
        List<Flower> list=flowerService.getAll();
        model.addAttribute("list",list);
        return "main";
    }
}
