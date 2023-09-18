
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEndorsementServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEndorsementServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="endorsement" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEndorsementServiceRequest", propOrder = {
    "endorsement"
})
public class UpdateEndorsementServiceRequest
    extends ServiceRequest
{

    protected Endorsement endorsement;

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link Endorsement }
     *     
     */
    public Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endorsement }
     *     
     */
    public void setEndorsement(Endorsement value) {
        this.endorsement = value;
    }

}
