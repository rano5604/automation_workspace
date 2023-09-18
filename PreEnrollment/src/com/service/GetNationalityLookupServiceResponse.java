
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNationalityLookupServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNationalityLookupServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="nationalityList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}learnerCountry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNationalityLookupServiceResponse", propOrder = {
    "nationalityList"
})
public class GetNationalityLookupServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<LearnerCountry> nationalityList;

    /**
     * Gets the value of the nationalityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearnerCountry }
     * 
     * 
     */
    public List<LearnerCountry> getNationalityList() {
        if (nationalityList == null) {
            nationalityList = new ArrayList<LearnerCountry>();
        }
        return this.nationalityList;
    }

}
