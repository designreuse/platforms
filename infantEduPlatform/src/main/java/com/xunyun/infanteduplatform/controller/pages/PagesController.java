package com.xunyun.infanteduplatform.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面controller
 * Created by PoohD on 2015/11/27.
 */
@Controller
@RequestMapping("page")
public class PagesController {
    /**
     *参考列表页 跳转
     * @return ModelAndView
     */
    @RequestMapping("/data")
    public ModelAndView dataTables() {
        return new ModelAndView("pages/dataTables");
    }

    /**
     *参考列表页
     * @return ModelAndView
     */
    @RequestMapping("/dataInput")
    public ModelAndView dataInput() {
        return new ModelAndView("pages/dataInput");
    }

    /**
     *单位信息列表页面
     * @return ModelAndView
     */
    @RequestMapping("/bureau")
    public ModelAndView bureau() {
        return new ModelAndView("pages/bureau/bureauInfo");
    }

    /**
     *单位信息列表页面
     * @return ModelAndView
     */
    @RequestMapping("/bureauOp")
    public ModelAndView bureauOperation(@RequestParam(value="bureauId",required = false)Long BureauId) {
        ModelAndView mav= new ModelAndView("pages/bureau/bureauOp");
        mav.addObject("BureauId",BureauId);
        return mav;
    }
}

