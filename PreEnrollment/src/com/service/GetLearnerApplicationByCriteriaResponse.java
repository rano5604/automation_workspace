
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLearnerApplicationByCriteriaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLearnerApplicationByCriteriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}getLearnerApplicationServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLearnerApplicationByCriteriaResponse", propOrder = {
    "_return"
})
public class GetLearnerApplicationByCriteriaResponse {

    @XmlElement(name = "return")
    protected GetLearnerApplicationServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLearnerApplicationServiceResponse }
     *     
     */
    public GetLearnerApplicationServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLearnerApplicationServiceResponse }
     *     
     */
    public void setReturn(GetLearnerApplicationServiceResponse value) {
        this._return = value;
    }

}
