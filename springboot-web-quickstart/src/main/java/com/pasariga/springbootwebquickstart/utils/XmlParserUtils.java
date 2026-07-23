package com.pasariga.springbootwebquickstart.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class XmlParserUtils {

    public static <T> List<T> parse(String file, Class<T> targetClass) {
        List<T> list = new ArrayList<>();

        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(file);
            Element rootElement = document.getRootElement();

            List<Element> elements = rootElement.elements();

            for (Element element : elements) {
                T obj = targetClass.getDeclaredConstructor().newInstance();

                List<Element> childElements = element.elements();

                for (Element child : childElements) {
                    String name = child.getName();
                    String text = child.getText();

                    Field field = targetClass.getDeclaredField(name);
                    field.setAccessible(true);
                    field.set(obj, text);
                }

                list.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}