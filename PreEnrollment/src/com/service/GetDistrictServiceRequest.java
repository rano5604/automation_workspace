
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDistrictServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDistrictServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="district" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerDistrict" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDistrictServiceRequest", propOrder = {
    "district"
})
public class GetDistrictServiceRequest
    extends ServiceRequest
{

    protected LearnerDistrict district;

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link LearnerDistrict }
     *     
     */
    public LearnerDistrict getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerDistrict }
     *     
     */
    public void setDistrict(LearnerDistrict value) {
        this.district = value;
    }

}
