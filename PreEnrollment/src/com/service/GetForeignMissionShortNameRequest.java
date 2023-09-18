
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForeignMissionShortNameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForeignMissionShortNameRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="foreignMissionShort" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}foreignMissionShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForeignMissionShortNameRequest", propOrder = {
    "foreignMissionShort"
})
public class GetForeignMissionShortNameRequest
    extends ServiceRequest
{

    protected ForeignMissionShort foreignMissionShort;

    /**
     * Gets the value of the foreignMissionShort property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignMissionShort }
     *     
     */
    public ForeignMissionShort getForeignMissionShort() {
        return foreignMissionShort;
    }

    /**
     * Sets the value of the foreignMissionShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignMissionShort }
     *     
     */
    public void setForeignMissionShort(ForeignMissionShort value) {
        this.foreignMissionShort = value;
    }

}
