
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appCountByAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appCountByAuthority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="authority" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}brtaOffice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appCountByAuthority", propOrder = {
    "applicationCount",
    "authority"
})
public class AppCountByAuthority {

    protected Integer applicationCount;
    protected BrtaOffice authority;

    /**
     * Gets the value of the applicationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationCount() {
        return applicationCount;
    }

    /**
     * Sets the value of the applicationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationCount(Integer value) {
        this.applicationCount = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link BrtaOffice }
     *     
     */
    public BrtaOffice getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrtaOffice }
     *     
     */
    public void setAuthority(BrtaOffice value) {
        this.authority = value;
    }

}
