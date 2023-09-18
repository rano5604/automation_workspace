
package com.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endorsementSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="endorsementSearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="OUTBOUND"/>
 *     &lt;enumeration value="INBOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "endorsementSearchType")
@XmlEnum
public enum EndorsementSearchType {

    ALL,
    OUTBOUND,
    INBOUND;

    public String value() {
        return name();
    }

    public static EndorsementSearchType fromValue(String v) {
        return valueOf(v);
    }

}
