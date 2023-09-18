
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationQAPendingAuthoritiesServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationQAPendingAuthoritiesServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="authorityList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}appCountByAuthority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationQAPendingAuthoritiesServiceResponse", propOrder = {
    "authorityList"
})
public class GetApplicationQAPendingAuthoritiesServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<AppCountByAuthority> authorityList;

    /**
     * Gets the value of the authorityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppCountByAuthority }
     * 
     * 
     */
    public List<AppCountByAuthority> getAuthorityList() {
        if (authorityList == null) {
            authorityList = new ArrayList<AppCountByAuthority>();
        }
        return this.authorityList;
    }

}
