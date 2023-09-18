
package com.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="applicantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIPLOMAT"/>
 *     &lt;enumeration value="GENERAL"/>
 *     &lt;enumeration value="ARMED_FORCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "applicantTypeEnum")
@XmlEnum
public enum ApplicantTypeEnum {

    DIPLOMAT,
    GENERAL,
    ARMED_FORCE;

    public String value() {
        return name();
    }

    public static ApplicantTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
