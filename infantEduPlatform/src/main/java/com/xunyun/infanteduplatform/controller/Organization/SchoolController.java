package com.xunyun.infanteduplatform.controller.organization;

import com.xunyun.infanteduplatform.domain.LoginUserInfo;
import com.xunyun.infanteduplatform.domain.SchoolInfo;
import com.xunyun.infanteduplatform.domain.SchoolRelation;
import com.xunyun.infanteduplatform.service.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/11/30.
 * 学校管理Controller
 */
@Controller @RequestMapping("school") public class SchoolController {
    @Autowired private SchoolService schoolService;

    /**
     * 查询单位下的学校
     *
     * @param bureauId 单位id
     * @return 学校
     */
    @RequestMapping(value = "querySchoolByBureauId", method = RequestMethod.POST) public
    @ResponseBody List<SchoolInfo> queryBureauInfo(@RequestParam int bureauId) {
        return this.schoolService.querySchoolByBureauId(bureauId);
    }

    /**
     * 添加修改单位信息
     *
     * @param schoolInfo 单位基本信息
     * @param bureauId   上级单位id
     * @return 保存状态
     */
    @RequestMapping(value = "saveSchool", method = RequestMethod.POST) public @ResponseBody
    Integer saveSchool(@ModelAttribute(value = "school") SchoolInfo schoolInfo,
        @RequestParam(value = "bureauId") Integer bureauId,
        HttpServletRequest request) {
        int saveOrUpdate = 0;
        HttpSession session = request.getSession();
        LoginUserInfo loginUserInfo = (LoginUserInfo) session.getAttribute("loginUserInfo");
        schoolInfo.setLastUpdatedBy(loginUserInfo.getUserid()+"");
        schoolInfo.setLastUpdateTime(Calendar.getInstance().getTime());
        schoolInfo.setDeleteFlg(0);
        if (schoolInfo.getSchoolId() != null) {
            this.schoolService.updateSchool(schoolInfo, bureauId);
        } else {
            schoolInfo.setCreatedBy(loginUserInfo.getUserid()+"");
            schoolInfo.setCreationTime(Calendar.getInstance().getTime());
            this.schoolService.saveSchool(schoolInfo, bureauId);
        }
        return saveOrUpdate;
    }

    @RequestMapping(value = "querySchool", method = RequestMethod.POST) public @ResponseBody
    SchoolInfo querySchool(@ModelAttribute(value = "school") SchoolInfo schoolInfo) {
        return this.schoolService.querySchool(schoolInfo);
    }

    @RequestMapping(value = "deleteSchool", method = RequestMethod.POST) public @ResponseBody
    void deleteSchool(@RequestParam(value = "schoolId") Integer schoolId) {
        this.schoolService.deleteSchool(schoolId);
    }
    
    //删除单位时查看该单位下是否有学校
     @RequestMapping(value ="queryChildSchool", method = RequestMethod.POST) 
     @ResponseBody
     public List<SchoolRelation> queryChildSchool(
         @RequestParam(value = "bureauId") Integer bureauId) {
       return this.schoolService.queryChildSchool(bureauId);
    }

    
    @RequestMapping(value = "querySchoolByNameAndBureauId", method = RequestMethod.POST) public
    @ResponseBody String querySchoolByNameAndBureauId(
        @ModelAttribute(value = "school") SchoolInfo schoolInfo) {
        Integer counts = this.schoolService.querySchoolByNameAndBureauId(schoolInfo);
        String message;
        if (counts > 0 && schoolInfo.getSchoolName() != null && !""
            .equals(schoolInfo.getSchoolName())) {
            message = "所选单位下存在重名的学校!";
        } else if (counts > 0 && schoolInfo.getSchoolCode() != null && !""
            .equals(schoolInfo.getSchoolCode())) {
            message = "学校组织机构代码重复!";
        } else {
            message = "true";
        }
        return message;
    }
}
