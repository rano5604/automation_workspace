
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDistrictServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDistrictServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="districtList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerDistrict" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDistrictServiceResponse", propOrder = {
    "districtList"
})
public class GetDistrictServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<LearnerDistrict> districtList;

    /**
     * Gets the value of the districtList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the districtList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrictList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearnerDistrict }
     * 
     * 
     */
    public List<LearnerDistrict> getDistrictList() {
        if (districtList == null) {
            districtList = new ArrayList<LearnerDistrict>();
        }
        return this.districtList;
    }

}
