package com.practice.project;
import org.apache.commons.collections.lang.StringUtils;
import org.apache.tapestry5.*;
import org.tynamo.PageType; 
import org.tynamo.services.BeanModelSourceContext; 
import org.tynamo.services.TynamoBeanContext; 
 
/**
 * This mixin has two purposes. 
 * <p/> 
 * it pushes the {@link TynamoBeanContext} into the {@link Environment} it's meant to be used in a {@link BeanDisplay} or with a {@link Grid} 
 * it pushes the {@link BeanModelSourceContext} into the {@link Environment} 
 */ 
public class BeanModelAdvisor 
{ 
 
 /**
  * The component to which this mixin is attached. 
  */ 
 @InjectContainer 
 private Object container; 
 
 @Inject 
 private Environment environment; 
 
 @Inject 
 private PropertyAccess propertyAccess; 
 
 /**
  * The context key 
  */ 
 @Parameter(defaultPrefix = BindingConstants.LITERAL, allowNull = false, value = "prop:guessKey()") 
 private String key; 
 
 /**
  * The container's property to retrieve the object (or bean) 
  */ 
 @Parameter(defaultPrefix = BindingConstants.LITERAL, allowNull = false) 
 private String containerProperty; 
  
}

