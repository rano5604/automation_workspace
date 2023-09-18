
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorityVersionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}menuInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}organizationInfo" minOccurs="0"/>
 *         &lt;element name="user" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}userInfo" minOccurs="0"/>
 *         &lt;element name="userVersionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDetailInfo", propOrder = {
    "authorityVersionId",
    "menuList",
    "organization",
    "user",
    "userVersionId"
})
public class UserDetailInfo {

    protected Integer authorityVersionId;
    @XmlElement(nillable = true)
    protected List<MenuInfo> menuList;
    protected OrganizationInfo organization;
    protected UserInfo user;
    protected Integer userVersionId;

    /**
     * Gets the value of the authorityVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorityVersionId() {
        return authorityVersionId;
    }

    /**
     * Sets the value of the authorityVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorityVersionId(Integer value) {
        this.authorityVersionId = value;
    }

    /**
     * Gets the value of the menuList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuInfo }
     * 
     * 
     */
    public List<MenuInfo> getMenuList() {
        if (menuList == null) {
            menuList = new ArrayList<MenuInfo>();
        }
        return this.menuList;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInfo }
     *     
     */
    public OrganizationInfo getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInfo }
     *     
     */
    public void setOrganization(OrganizationInfo value) {
        this.organization = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setUser(UserInfo value) {
        this.user = value;
    }

    /**
     * Gets the value of the userVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserVersionId() {
        return userVersionId;
    }

    /**
     * Sets the value of the userVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserVersionId(Integer value) {
        this.userVersionId = value;
    }

}
