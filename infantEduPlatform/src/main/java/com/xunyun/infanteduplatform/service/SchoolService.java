package com.xunyun.infanteduplatform.service;

import com.xunyun.infanteduplatform.domain.SchoolInfo;
import com.xunyun.infanteduplatform.domain.SchoolRelation;
import com.xunyun.infanteduplatform.persistent.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/1.
 * 学校Service
 */
@Service("SchoolService")
public class SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    public List<SchoolInfo> querySchoolByBureauId (int bureauId){
        return this.schoolMapper.querySchoolByBureauId(bureauId);
    }

    public Integer saveSchool(SchoolInfo schoolInfo,Integer bureauId){
        this.schoolMapper.saveSchool(schoolInfo);
        SchoolRelation schoolRelation = new SchoolRelation();
        schoolRelation.setBureauId(bureauId);
        schoolRelation.setSchoolId(schoolInfo.getSchoolId());
        return this.schoolMapper.saveSchoolRelation(schoolRelation);
    }

    public Integer updateSchool(SchoolInfo schoolInfo,Integer bureauId){
        this.schoolMapper.updateSchool(schoolInfo);
        SchoolRelation schoolRelation = new SchoolRelation();
        schoolRelation.setSchoolId(schoolInfo.getSchoolId());
        schoolRelation.setBureauId(bureauId);
        return this.schoolMapper.updateSchoolRelation(schoolRelation);
    }

    public SchoolInfo querySchool(SchoolInfo schoolInfo){
        return this.schoolMapper.querySchool(schoolInfo);
    }

    public void deleteSchool(Integer schoolId){
        this.schoolMapper.deleteSchool(schoolId);
        this.schoolMapper.deleteSchoolRelation(schoolId);
    }
    
    //删除单位时查看该单位下是否有学校
     public List<SchoolRelation> queryChildSchool(Integer bureauId){
       return this.schoolMapper.queryChildSchool(bureauId);
     }

    public Integer querySchoolByNameAndBureauId(SchoolInfo schoolInfo){
        return this.schoolMapper.querySchoolByNameAndBureauId(schoolInfo);
    }
}
