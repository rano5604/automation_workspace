
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="currentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailInfo" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}userDetailInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginServiceResponse", propOrder = {
    "currentDate",
    "detailInfo"
})
public class LoginServiceResponse
    extends ServiceResponse
{

    protected String currentDate;
    protected UserDetailInfo detailInfo;

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDate(String value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the detailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailInfo }
     *     
     */
    public UserDetailInfo getDetailInfo() {
        return detailInfo;
    }

    /**
     * Sets the value of the detailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailInfo }
     *     
     */
    public void setDetailInfo(UserDetailInfo value) {
        this.detailInfo = value;
    }

}
