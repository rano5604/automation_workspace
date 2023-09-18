
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLookupServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLookupServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="lookupData" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerLookupData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLookupServiceRequest", propOrder = {
    "lookupData"
})
public class GetLookupServiceRequest
    extends ServiceRequest
{

    protected LearnerLookupData lookupData;

    /**
     * Gets the value of the lookupData property.
     * 
     * @return
     *     possible object is
     *     {@link LearnerLookupData }
     *     
     */
    public LearnerLookupData getLookupData() {
        return lookupData;
    }

    /**
     * Sets the value of the lookupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerLookupData }
     *     
     */
    public void setLookupData(LearnerLookupData value) {
        this.lookupData = value;
    }

}
