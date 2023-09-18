
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationStatusHistoryServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationStatusHistoryServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationStatusHistoryCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationStatusHistoryServiceRequest", propOrder = {
    "criteria"
})
public class GetApplicationStatusHistoryServiceRequest
    extends ServiceRequest
{

    protected ApplicationStatusHistoryCriteria criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusHistoryCriteria }
     *     
     */
    public ApplicationStatusHistoryCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusHistoryCriteria }
     *     
     */
    public void setCriteria(ApplicationStatusHistoryCriteria value) {
        this.criteria = value;
    }

}
