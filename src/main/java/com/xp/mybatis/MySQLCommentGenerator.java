package com.xp.mybatis;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.util.Properties;
import java.util.Set;

/**
 * @Author xiexiangpeng
 */
public class MySQLCommentGenerator extends DefaultCommentGenerator {

   private Properties properties;

   public MySQLCommentGenerator() {
      properties = new Properties();
   }

   @Override
   public void addConfigurationProperties(Properties properties) {
      // 获取自定义的 properties
      this.properties.putAll(properties);
   }

   @Override
   public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
      // 获取表注释
      String remarks = introspectedTable.getRemarks();
      if (remarks != null && !"".equals(remarks)) {
         topLevelClass.addJavaDocLine("/**");
         topLevelClass.addJavaDocLine(" * " + remarks);
         topLevelClass.addJavaDocLine(" */");
      }

   }

   @Override
   public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
      // 获取列注释
      String remarks = introspectedColumn.getRemarks();
      if (remarks != null && !"".equals(remarks)) {
         field.addJavaDocLine("/**");
         field.addJavaDocLine(" * " + remarks);
         field.addJavaDocLine(" */");
      }
   }


   @Override
   public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

   }


   @Override
   public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

   }

   @Override
   public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {

   }

   @Override
   public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

   }

   @Override
   public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

   }

   @Override
   public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

   }

   @Override
   public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

   }

   @Override
   public void addJavaFileComment(CompilationUnit compilationUnit) {

   }

   @Override
   public void addComment(XmlElement xmlElement) {

   }

   @Override
   public void addRootComment(XmlElement xmlElement) {

   }

   @Override
   public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

   }

   @Override
   public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

   }

   @Override
   public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

   }

   @Override
   public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

   }

   @Override
   public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

   }

}