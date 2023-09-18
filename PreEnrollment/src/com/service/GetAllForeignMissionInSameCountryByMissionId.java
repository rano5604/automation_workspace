
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllForeignMissionInSameCountryByMissionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllForeignMissionInSameCountryByMissionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}getForeignMissionServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllForeignMissionInSameCountryByMissionId", propOrder = {
    "request"
})
public class GetAllForeignMissionInSameCountryByMissionId {

    protected GetForeignMissionServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetForeignMissionServiceRequest }
     *     
     */
    public GetForeignMissionServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetForeignMissionServiceRequest }
     *     
     */
    public void setRequest(GetForeignMissionServiceRequest value) {
        this.request = value;
    }

}
