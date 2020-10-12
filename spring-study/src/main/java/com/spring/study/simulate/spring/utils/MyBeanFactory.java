package com.spring.study.simulate.spring.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/8 2:24 下午
 */
public class MyBeanFactory {

	Map<String, Object> map = new HashMap<>();
	

	public MyBeanFactory(String xml) {
		parseXml(xml);
	}

	public void parseXml(String xml) {

		File file = new File("/Users/macos/IdeaProjects/personal/spring-framework/spring-study/build/resources/main" + "//" + xml);

		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element rootElement = document.getRootElement();
//			List<Element> elements = rootElement.elements();

			System.out.println(rootElement);

//			Iterator it = rootElement.elementIterator();
//
//			while (it.hasNext()) {
//				Element element =(Element) it.next();
//				Attribute attributeId = element.attribute("id");
//				String idName = attributeId.getValue();
//
//				Attribute aClass = element.attribute("class");
//				String className = aClass.getValue();
//				Object instance = Class.forName(className).newInstance();
//
//				map.put(idName, instance);
//
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(map);

	}

	public Object getBean(String beanName) {

		return null;
	}

}
