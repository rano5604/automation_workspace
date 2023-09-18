
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationCountByAuthorityServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationCountByAuthorityServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="appCountByAuthority" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}appCountByAuthority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationCountByAuthorityServiceResponse", propOrder = {
    "appCountByAuthority"
})
public class GetApplicationCountByAuthorityServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<AppCountByAuthority> appCountByAuthority;

    /**
     * Gets the value of the appCountByAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appCountByAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppCountByAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppCountByAuthority }
     * 
     * 
     */
    public List<AppCountByAuthority> getAppCountByAuthority() {
        if (appCountByAuthority == null) {
            appCountByAuthority = new ArrayList<AppCountByAuthority>();
        }
        return this.appCountByAuthority;
    }

}
