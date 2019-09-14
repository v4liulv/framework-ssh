package com.sinobest.framework.utils;

import com.sinobest.framework.util.StringUtil;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liulv
 * @date 2019/1/2
 * @time 1:23
 * @description 实体 工具类
 */
public class BeanUtil {

    /**
     * 根据属性名获取属性值
     */
    public static Object getFieldValueByName(String fieldName, Object o) throws Exception {
        String firstLetter = fieldName.substring(0, 1).toUpperCase();
        String getter = "get" + firstLetter + fieldName.substring(1);
        Method method = o.getClass().getMethod(getter, new Class[]{});
        Object value = method.invoke(o, new Object[]{});
        return value;
    }

    public static Object getFieldValue(Object o, String fieldName) throws Exception {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        String value = "";
        for (int i = 0; i < fields.length; i++) {
            if (fieldName.equals(fields[i].getName())) getFieldValueByName(fieldName, o);
        }
        return value;
    }

    /**
     * 获取属性名数组
     */
    public static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    public static String[] getFiledName(Class<?> oclass) {
        return getFiledName(oclass, false);
    }

    /**
     * 从 Hibernate实体类 Class获取其字段名
     *
     * @param oclass Hibernate实体类 Class
     * @return
     */
    public static String[] getFiledName(Class<?> oclass, boolean isDB) {
        Field[] fields = oclass.getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();
            if (isDB) fieldName = StringUtil.tranFieldName(fieldName);
            fieldNames[i] = fieldName;
        }

        return fieldNames;
    }

    /**
     * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     */
    public static List<Map<String, Object>> getFieldsInfo(Object o) throws Exception {
        Field[] fields = o.getClass().getDeclaredFields();
        /*String[] fieldNames = new String[fields.length];*/
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> infoMap = null;
        for (Field field : fields) {
            infoMap = new HashMap<>();
            infoMap.put("type", field.getType().toString());
            infoMap.put("name", field.getName());
            infoMap.put("value", getFieldValueByName(field.getName(), o));
            list.add(infoMap);
        }
        return list;
    }

    /**
     * 获取对象的所有属性值，返回一个对象数组
     */
    public Object[] getFiledValues(Object o) throws Exception {
        String[] fieldNames = this.getFiledName(o);
        Object[] value = new Object[fieldNames.length];
        for (int i = 0; i < fieldNames.length; i++) {
            value[i] = this.getFieldValueByName(fieldNames[i], o);
        }
        return value;
    }

    /**
     * 遍历实体返回其属性和属性值的Map
     *
     * @param e 实体类
     * @return 返回实体属性和，属性值
     * @throws Exception
     */
    public static Map<String, Object> traverse(Object e, boolean isNotNull) throws Exception {
        Class cls = e.getClass();
        Map<String, Object> result = null;
        Field[] fields = cls.getDeclaredFields();
        if (fields.length > 0) result = new HashMap<>();
        for (Field f : fields) {
            f.setAccessible(true);
            /*System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(e));*/
            if (isNotNull) {
                if (f.get(e) != null && !"".equals(f.get(e))) result.put(f.getName(), f.get(e));
            }
        }
        return result;
    }

    /**
     * bean实体属性合并，将destination的非空属性合并到target实例的实例中
     */
    public static <M> void merge(M destination, M target) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());

        // 遍历所有属性
        for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
            // 允许读写
            if (descriptor.getWriteMethod() != null) {
                //Object originalValue = descriptor.getReadMethod().invoke(target);//target中（descriptor）的值
                // Only copy values values where the destination values is null
                //if (originalValue == null) {
                Object defaultValue = descriptor.getReadMethod().invoke(destination);//destination中（descriptor）的值
                if (defaultValue != null && !"".equals(defaultValue)) {
                    descriptor.getWriteMethod().invoke(target, defaultValue);//用defaultValue覆盖到target
                }
                //}
            }
        }
    }
}
