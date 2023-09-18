
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForeignMissionServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForeignMissionServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="foreignMission" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}foreignMission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForeignMissionServiceRequest", propOrder = {
    "foreignMission"
})
public class GetForeignMissionServiceRequest
    extends ServiceRequest
{

    protected ForeignMission foreignMission;

    /**
     * Gets the value of the foreignMission property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignMission }
     *     
     */
    public ForeignMission getForeignMission() {
        return foreignMission;
    }

    /**
     * Sets the value of the foreignMission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignMission }
     *     
     */
    public void setForeignMission(ForeignMission value) {
        this.foreignMission = value;
    }

}
