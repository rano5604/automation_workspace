
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForeignMissionServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForeignMissionServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="missionList" type="{http://bean.enrollment.ws.preenrollment.hsdl.tigerit.com/}foreignMission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForeignMissionServiceResponse", propOrder = {
    "missionList"
})
public class GetForeignMissionServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ForeignMission> missionList;

    /**
     * Gets the value of the missionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignMission }
     * 
     * 
     */
    public List<ForeignMission> getMissionList() {
        if (missionList == null) {
            missionList = new ArrayList<ForeignMission>();
        }
        return this.missionList;
    }

}
