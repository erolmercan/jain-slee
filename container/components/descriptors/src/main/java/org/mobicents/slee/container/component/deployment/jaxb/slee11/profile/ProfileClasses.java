/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.17 at 04:43:58 PM WET 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee11.profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "profileCmpInterface",
    "profileLocalInterface",
    "profileManagementInterface",
    "profileAbstractClass",
    "profileTableInterface",
    "profileUsageParametersInterface"
})
@XmlRootElement(name = "profile-classes")
public class ProfileClasses {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "profile-cmp-interface", required = true)
    protected ProfileCmpInterface profileCmpInterface;
    @XmlElement(name = "profile-local-interface")
    protected ProfileLocalInterface profileLocalInterface;
    @XmlElement(name = "profile-management-interface")
    protected ProfileManagementInterface profileManagementInterface;
    @XmlElement(name = "profile-abstract-class")
    protected ProfileAbstractClass profileAbstractClass;
    @XmlElement(name = "profile-table-interface")
    protected ProfileTableInterface profileTableInterface;
    @XmlElement(name = "profile-usage-parameters-interface")
    protected ProfileUsageParametersInterface profileUsageParametersInterface;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the profileCmpInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCmpInterface }
     *     
     */
    public ProfileCmpInterface getProfileCmpInterface() {
        return profileCmpInterface;
    }

    /**
     * Sets the value of the profileCmpInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCmpInterface }
     *     
     */
    public void setProfileCmpInterface(ProfileCmpInterface value) {
        this.profileCmpInterface = value;
    }

    /**
     * Gets the value of the profileLocalInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileLocalInterface }
     *     
     */
    public ProfileLocalInterface getProfileLocalInterface() {
        return profileLocalInterface;
    }

    /**
     * Sets the value of the profileLocalInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileLocalInterface }
     *     
     */
    public void setProfileLocalInterface(ProfileLocalInterface value) {
        this.profileLocalInterface = value;
    }

    /**
     * Gets the value of the profileManagementInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileManagementInterface }
     *     
     */
    public ProfileManagementInterface getProfileManagementInterface() {
        return profileManagementInterface;
    }

    /**
     * Sets the value of the profileManagementInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileManagementInterface }
     *     
     */
    public void setProfileManagementInterface(ProfileManagementInterface value) {
        this.profileManagementInterface = value;
    }

    /**
     * Gets the value of the profileAbstractClass property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileAbstractClass }
     *     
     */
    public ProfileAbstractClass getProfileAbstractClass() {
        return profileAbstractClass;
    }

    /**
     * Sets the value of the profileAbstractClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileAbstractClass }
     *     
     */
    public void setProfileAbstractClass(ProfileAbstractClass value) {
        this.profileAbstractClass = value;
    }

    /**
     * Gets the value of the profileTableInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileTableInterface }
     *     
     */
    public ProfileTableInterface getProfileTableInterface() {
        return profileTableInterface;
    }

    /**
     * Sets the value of the profileTableInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileTableInterface }
     *     
     */
    public void setProfileTableInterface(ProfileTableInterface value) {
        this.profileTableInterface = value;
    }

    /**
     * Gets the value of the profileUsageParametersInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileUsageParametersInterface }
     *     
     */
    public ProfileUsageParametersInterface getProfileUsageParametersInterface() {
        return profileUsageParametersInterface;
    }

    /**
     * Sets the value of the profileUsageParametersInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileUsageParametersInterface }
     *     
     */
    public void setProfileUsageParametersInterface(ProfileUsageParametersInterface value) {
        this.profileUsageParametersInterface = value;
    }

}
