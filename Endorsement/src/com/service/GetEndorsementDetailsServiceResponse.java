
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEndorsementDetailsServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEndorsementDetailsServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="endorsementDetails" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsementDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEndorsementDetailsServiceResponse", propOrder = {
    "endorsementDetails"
})
public class GetEndorsementDetailsServiceResponse
    extends ServiceResponse
{

    protected EndorsementDetails endorsementDetails;

    /**
     * Gets the value of the endorsementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementDetails }
     *     
     */
    public EndorsementDetails getEndorsementDetails() {
        return endorsementDetails;
    }

    /**
     * Sets the value of the endorsementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementDetails }
     *     
     */
    public void setEndorsementDetails(EndorsementDetails value) {
        this.endorsementDetails = value;
    }

}
