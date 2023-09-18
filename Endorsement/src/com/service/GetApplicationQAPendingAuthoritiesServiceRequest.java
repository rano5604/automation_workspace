
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationQAPendingAuthoritiesServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationQAPendingAuthoritiesServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="authorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationQAPendingAuthoritiesServiceRequest", propOrder = {
    "authorityCode",
    "authorityId"
})
public class GetApplicationQAPendingAuthoritiesServiceRequest
    extends ServiceRequest
{

    protected String authorityCode;
    protected Long authorityId;

    /**
     * Gets the value of the authorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityCode() {
        return authorityCode;
    }

    /**
     * Sets the value of the authorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityCode(String value) {
        this.authorityCode = value;
    }

    /**
     * Gets the value of the authorityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthorityId(Long value) {
        this.authorityId = value;
    }

}
