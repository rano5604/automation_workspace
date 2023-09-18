
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEndorsementApplicationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEndorsementApplicationServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="endorsementApplication" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsementApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEndorsementApplicationServiceResponse", propOrder = {
    "endorsementApplication"
})
public class GetEndorsementApplicationServiceResponse
    extends ServiceResponse
{

    protected EndorsementApplication endorsementApplication;

    /**
     * Gets the value of the endorsementApplication property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementApplication }
     *     
     */
    public EndorsementApplication getEndorsementApplication() {
        return endorsementApplication;
    }

    /**
     * Sets the value of the endorsementApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementApplication }
     *     
     */
    public void setEndorsementApplication(EndorsementApplication value) {
        this.endorsementApplication = value;
    }

}
