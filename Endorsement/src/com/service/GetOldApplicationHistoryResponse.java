
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOldApplicationHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOldApplicationHistoryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="detailsList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationHistoryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOldApplicationHistoryResponse", propOrder = {
    "detailsList"
})
public class GetOldApplicationHistoryResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ApplicationHistoryDetails> detailsList;

    /**
     * Gets the value of the detailsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationHistoryDetails }
     * 
     * 
     */
    public List<ApplicationHistoryDetails> getDetailsList() {
        if (detailsList == null) {
            detailsList = new ArrayList<ApplicationHistoryDetails>();
        }
        return this.detailsList;
    }

}
