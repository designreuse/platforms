package com.xunyun.infanteduplatform.domain;

import java.util.Date;

public class SysUserInorg {
  
  private Integer userId;
  
  private Integer organizationId;
  
  private String organizationType;
  
  private Integer userType;
  
  private String userCode;
  
  private Integer isAdmin;
  
  private Integer isAuthentication;
  
  private String nickName;
  
  private String userName;
  
  private long gendercode;// 性别
  
  private String name;
  
  private String idno;// 身份证号
  
  private String mobile;// 手机
  
  private String telephone;// 联系电话
  
  private String email;// 邮箱
  
  private String qq;// QQ
  
  private String description;// 个人介绍
  
  private String photourl;// 个人头像图片文件夹名称
  
  private String url;// 个人网址
  
  private Date creationtime;// 创建时间
  
  private String createdby;// 创建人
  
  private Date lastupdatetime;// 最终修改时间
  
  private String lastupdatedby;// 最终修改人
  
  private Integer deleteFlg;
  
  private String mainTeacherId;
  
  private String nurserygovernessId;
  
  private String withTeacherId;
  
  private Integer classId;
  
  //用户教师身份区别标标识
  private Integer type;
  
  private Date startTime;
//开始数目
  private Integer startNumber;
  //结束数目
  private Integer endNumber;
  // 查询条件
  private String keyValue;
  // 总条数
  private Integer countNumber;
  
  SysUserInfo sysUserInfo;
  UserInClassEntity userInClass;
  TeacherInClassEntity teachInclass;
  SysUserInDepartment sysUserIndepartment;
  
  public Integer getIsAuthentication() {
    return isAuthentication;
  }

  public void setIsAuthentication(Integer isAuthentication) {
    this.isAuthentication = isAuthentication;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public long getGendercode() {
    return gendercode;
  }

  public void setGendercode(long gendercode) {
    this.gendercode = gendercode;
  }

  public String getIdno() {
    return idno;
  }

  public void setIdno(String idno) {
    this.idno = idno;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhotourl() {
    return photourl;
  }

  public void setPhotourl(String photourl) {
    this.photourl = photourl;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Date getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(Date creationtime) {
    this.creationtime = creationtime;
  }

  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public Date getLastupdatetime() {
    return lastupdatetime;
  }

  public void setLastupdatetime(Date lastupdatetime) {
    this.lastupdatetime = lastupdatetime;
  }

  public String getLastupdatedby() {
    return lastupdatedby;
  }

  public void setLastupdatedby(String lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
  }

  public SysUserInfo getSysUserInfo() {
    return sysUserInfo;
  }

  public void setSysUserInfo(SysUserInfo sysUserInfo) {
    this.sysUserInfo = sysUserInfo;
  }

  public UserInClassEntity getUserInClass() {
    return userInClass;
  }

  public void setUserInClass(UserInClassEntity userInClass) {
    this.userInClass = userInClass;
  }

  public TeacherInClassEntity getTeachInclass() {
    return teachInclass;
  }

  public void setTeachInclass(TeacherInClassEntity teachInclass) {
    this.teachInclass = teachInclass;
  }

  public SysUserInDepartment getSysUserIndepartment() {
    return sysUserIndepartment;
  }

  public void setSysUserIndepartment(SysUserInDepartment sysUserIndepartment) {
    this.sysUserIndepartment = sysUserIndepartment;
  }

  public Integer getStartNumber() {
    return startNumber;
  }

  public void setStartNumber(Integer startNumber) {
    this.startNumber = startNumber;
  }

  public Integer getEndNumber() {
    return endNumber;
  }

  public void setEndNumber(Integer endNumber) {
    this.endNumber = endNumber;
  }

  public Integer getCountNumber() {
    return countNumber;
  }

  public void setCountNumber(Integer countNumber) {
    this.countNumber = countNumber;
  }

  public String getKeyValue() {
    return keyValue;
  }


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getMainTeacherId() {
    return mainTeacherId;
  }

  public void setMainTeacherId(String mainTeacherId) {
    this.mainTeacherId = mainTeacherId;
  }

  public String getNurserygovernessId() {
    return nurserygovernessId;
  }

  public void setNurserygovernessId(String nurserygovernessId) {
    this.nurserygovernessId = nurserygovernessId;
  }

  public String getWithTeacherId() {
    return withTeacherId;
  }

  public void setWithTeacherId(String withTeacherId) {
    this.withTeacherId = withTeacherId;
  }

  public Integer getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Integer isAdmin) {
    this.isAdmin = isAdmin;
  }



  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public Integer getClassId() {
    return classId;
  }

  public void setClassId(Integer classId) {
    this.classId = classId;
  }

  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public Integer getDeleteFlg() {
    return deleteFlg;
  }

  public void setDeleteFlg(Integer deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public void setKeyValue(String keyValue) {
    // TODO Auto-generated method stub
    
  }

  public void setStartNumber(int startNumber) {
    // TODO Auto-generated method stub
    
  }

  public void setEndNumber(int endNumber) {
    // TODO Auto-generated method stub
    
  }

}
