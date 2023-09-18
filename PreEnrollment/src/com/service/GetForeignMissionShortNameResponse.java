
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForeignMissionShortNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForeignMissionShortNameResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="shortMissionList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}foreignMissionShort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForeignMissionShortNameResponse", propOrder = {
    "shortMissionList"
})
public class GetForeignMissionShortNameResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ForeignMissionShort> shortMissionList;

    /**
     * Gets the value of the shortMissionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortMissionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortMissionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignMissionShort }
     * 
     * 
     */
    public List<ForeignMissionShort> getShortMissionList() {
        if (shortMissionList == null) {
            shortMissionList = new ArrayList<ForeignMissionShort>();
        }
        return this.shortMissionList;
    }

}
