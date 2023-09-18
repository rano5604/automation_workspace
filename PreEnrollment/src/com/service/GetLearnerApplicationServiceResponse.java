
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLearnerApplicationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLearnerApplicationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="preEnroll" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLearnerApplicationServiceResponse", propOrder = {
    "preEnroll"
})
public class GetLearnerApplicationServiceResponse
    extends ServiceResponse
{

    protected LearnerApplication preEnroll;

    /**
     * Gets the value of the preEnroll property.
     * 
     * @return
     *     possible object is
     *     {@link LearnerApplication }
     *     
     */
    public LearnerApplication getPreEnroll() {
        return preEnroll;
    }

    /**
     * Sets the value of the preEnroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerApplication }
     *     
     */
    public void setPreEnroll(LearnerApplication value) {
        this.preEnroll = value;
    }

}
