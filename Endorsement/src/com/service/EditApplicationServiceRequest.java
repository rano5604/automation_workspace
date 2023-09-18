
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationInfoEdit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editApplicationServiceRequest", propOrder = {
    "applicationInfo"
})
public class EditApplicationServiceRequest
    extends ServiceRequest
{

    protected ApplicationInfoEdit applicationInfo;

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfoEdit }
     *     
     */
    public ApplicationInfoEdit getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoEdit }
     *     
     */
    public void setApplicationInfo(ApplicationInfoEdit value) {
        this.applicationInfo = value;
    }

}
