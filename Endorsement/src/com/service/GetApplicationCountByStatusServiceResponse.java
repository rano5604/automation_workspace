
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationCountByStatusServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationCountByStatusServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="appCountByStatus" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}appCountByStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationCountByStatusServiceResponse", propOrder = {
    "appCountByStatus"
})
public class GetApplicationCountByStatusServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<AppCountByStatus> appCountByStatus;

    /**
     * Gets the value of the appCountByStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appCountByStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppCountByStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppCountByStatus }
     * 
     * 
     */
    public List<AppCountByStatus> getAppCountByStatus() {
        if (appCountByStatus == null) {
            appCountByStatus = new ArrayList<AppCountByStatus>();
        }
        return this.appCountByStatus;
    }

}
