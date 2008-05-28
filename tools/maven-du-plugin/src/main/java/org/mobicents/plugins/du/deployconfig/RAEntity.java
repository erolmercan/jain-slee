package org.mobicents.plugins.du.deployconfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class RAEntity {

	/**
	* <ra-entity resource-adaptor-id="HttpClientResourceAdaptor#org.mobicents#1.0" entity-name="HttpClientRA">
    *     <properties url="...">
    *       <property name="user" value="admin" />
    *       <property name="password" value="admin" />
    *     </properties>
    *     <ra-link name="HTTPClientRA" />
    *   </ra-entity>
    */
	
	public static RAEntity parse(Element element) {
		
		String resourceAdaptorId = element.getAttribute("resource-adaptor-id");
		if (resourceAdaptorId == null) {
			throw new IllegalArgumentException("Invalid element, resource-adaptor-id attr is null");
		}
		String entityName = element.getAttribute("entity-name");
		if (entityName == null) {
			throw new IllegalArgumentException("Invalid element, entity-name attr is null");
		}
		String propertiesFile = null;
		Properties properties = new Properties();
		List<String> raLinks = new ArrayList<String>();
		
		NodeList propertiesNodeList = element.getElementsByTagName("properties");
		if (propertiesNodeList.getLength() > 1) {
			throw new IllegalArgumentException("Invalid ra-entity element, has more than one properties child");
		}
		else {
			Element propertiesElement = ((Element)propertiesNodeList.item(0));
			// properties file attr
			propertiesFile = propertiesElement.getAttribute("file");
			// properties childs
			NodeList propertiesChilds = propertiesElement.getElementsByTagName("property");
			for(int i=0;i<propertiesChilds.getLength();i++) {
				Element propertyElement = ((Element)propertiesChilds.item(i));
				// property element
				String propertyName = propertyElement.getAttribute("name");
				String propertyValue = propertyElement.getAttribute("value");
				if (propertyName == null) {				
					throw new IllegalArgumentException("Invalid element, found a properties's child with null name");
				}
				if (propertyValue == null) {
					throw new IllegalArgumentException("Invalid element, found a properties's child with null value");
				}
				properties.setProperty(propertyName,propertyValue);

			}
		}
		NodeList raLinkNodeList = element.getElementsByTagName("ra-link");
		for(int i=0;i<raLinkNodeList.getLength();i++) {
			String raLinkName = ((Element)raLinkNodeList.item(i)).getAttribute("name");
			if (raLinkName != null) {
				raLinks.add(raLinkName);
			}
			else {
				throw new IllegalArgumentException(" found invalid ra-link child, name attr is null");
			}
			
		}
		
		return new RAEntity(resourceAdaptorId,entityName,propertiesFile,properties,raLinks);
	}
	
	public RAEntity(String resourceAdaptorId, String entityName, String propertiesFile,Properties properties,List<String> raLinks){
		this.resourceAdaptorId = resourceAdaptorId;
		this.entityName = entityName;
		this.propertiesFile = propertiesFile;
		this.properties = properties;
		this.raLinks = raLinks;
	}
	
	
	private final String resourceAdaptorId;
	
	private final String entityName;
	
	private final String propertiesFile;
	
	private final Properties properties;
	
	private final List<String> raLinks;

	public String getEntityName() {
		return entityName;
	}
	
	public String getPropertiesFile() {
		return propertiesFile;
	}

	public Properties getProperties() {
		return properties;
	}

	public List<String> getRaLinks() {
		return raLinks;
	}

	public String getResourceAdaptorId() {
		return resourceAdaptorId;
	}
	
}
