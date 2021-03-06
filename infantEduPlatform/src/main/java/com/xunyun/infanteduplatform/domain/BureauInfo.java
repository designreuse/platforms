package com.xunyun.infanteduplatform.domain;

import java.util.Date;

/**
 * Created by Administrator on 2015/11/30.
 * 单位信息实体类
 */
public class BureauInfo {
    private Integer organizationId;		/**数据编码，唯一编号，自增长*/
    private String organizationCode;		/**单位机构代码*/
    private String bureauName;			/**单位名称，指学校主管单位标准名称，与公章一致*/
    private String shortName;		/**单位简称*/
    private String locationCode;		/**所在地行政区域划码*/
    private String bureauAddress;			/**主管单位地址*/
    private String locationTypeCode;		/**所在地区类别码*/
    private String locationEconCode;		/**所在地经济属性码*/
    private String locationFolkCode;		/**所在地民族属性*/
    private String postalCode;		/**邮政编码*/
    private String dutyPerson;	/**联系人*/
    private String telephone;			/**联系电话*/
    private String fax;/**传真电话*/
    private String email;	/**电子信箱*/
    private String homepageUrl;		/**主页地址*/
    private String ipAddress;		/**IP地址*/
    private Integer orgType;	/**单位类型，0:普通单位，1:主管单位*/
    private Integer deleteFlg;			/**删除标记，0.未删除 1.删除*/
    private Date creationTime;/**创建时间*/
    private String createdBy;			/**创建人*/
    private Date lastUpdateTime;/**最终修改时间*/
    private String lastUpdatedBy;		/**最终修改人*/


    private Integer bureauId; /** 单位机构编码    */
    private Integer parentBureauId;   /** 所属主管单位编码     */
    private Integer isChild;    /**是否有子单位，0：没有，1：有*/
    
    private String locationProvinceCode; /**所在地行政区域省码*/
    private String locationCityCode; /**所在地行政区域市码*/
    private String locationAreaCode; /**所在地行政区域区码*/
    private String locationProvinceName; /**所在地行政区域省名字*/
    private String locationCityName; /**所在地行政区域市名字*/
    private String locationAreaName; /**所在地行政区域区名字*/
    private String smallCategoryName; /***/
    
    private String parentBureauName;

    public String getSmallCategoryName() {
      return smallCategoryName;
    }

    public void setSmallCategoryName(String smallCategoryName) {
      this.smallCategoryName = smallCategoryName;
    }

    public String getLocationProvinceName() {
      return locationProvinceName;
    }

    public void setLocationProvinceName(String locationProvinceName) {
      this.locationProvinceName = locationProvinceName;
    }

    public String getLocationCityName() {
      return locationCityName;
    }

    public void setLocationCityName(String locationCityName) {
      this.locationCityName = locationCityName;
    }

    public String getLocationAreaName() {
      return locationAreaName;
    }

    public void setLocationAreaName(String locationAreaName) {
      this.locationAreaName = locationAreaName;
    }

    public String getLocationProvinceCode() {
      return locationProvinceCode;
    }

    public void setLocationProvinceCode(String locationProvinceCode) {
      this.locationProvinceCode = locationProvinceCode;
    }

    public String getLocationCityCode() {
      return locationCityCode;
    }

    public void setLocationCityCode(String locationCityCode) {
      this.locationCityCode = locationCityCode;
    }

    public String getLocationAreaCode() {
      return locationAreaCode;
    }

    public void setLocationAreaCode(String locationAreaCode) {
      this.locationAreaCode = locationAreaCode;
    }

    public String getParentBureauName() {
        return parentBureauName;
    }

    public void setParentBureauName(String parentBureauName) {
        this.parentBureauName = parentBureauName;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    /** getter setter*/



    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getBureauName() {
        return bureauName;
    }

    public void setBureauName(String bureauName) {
        this.bureauName = bureauName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getBureauAddress() {
        return bureauAddress;
    }

    public void setBureauAddress(String bureauAddress) {
        this.bureauAddress = bureauAddress;
    }

    public String getLocationTypeCode() {
        return locationTypeCode;
    }

    public void setLocationTypeCode(String locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }

    public String getLocationEconCode() {
        return locationEconCode;
    }

    public void setLocationEconCode(String locationEconCode) {
        this.locationEconCode = locationEconCode;
    }

    public String getLocationFolkCode() {
        return locationFolkCode;
    }

    public void setLocationFolkCode(String locationFolkCode) {
        this.locationFolkCode = locationFolkCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public Integer getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(Integer deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Integer getBureauId() {
        return bureauId;
    }

    public void setBureauId(Integer bureauId) {
        this.bureauId = bureauId;
    }

    public Integer getParentBureauId() {
        return parentBureauId;
    }

    public void setParentBureauId(Integer parentBureauId) {
        this.parentBureauId = parentBureauId;
    }

    public Integer getIsChild() {
        return isChild;
    }

    public void setIsChild(Integer isChild) {
        this.isChild = isChild;
    }
}
