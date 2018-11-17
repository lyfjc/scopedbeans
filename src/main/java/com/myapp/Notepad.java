package com.myapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/*@Scope(value = WebApplicationContext.SCOPE_SESSION,
 proxyMode=ScopedProxyMode.INTERFACES)*/
/*@Scope(value = WebApplicationContext.SCOPE_REQUEST,
 proxyMode=ScopedProxyMode.INTERFACES)*/
/*@Scope(value = WebApplicationContext.SCOPE_SESSION,
 proxyMode=ScopedProxyMode.TARGET_CLASS)*/
/*
XML中的声明方式：
<bean class="com.myapp.ShoppingCart" scope="session">
 <aop:scoped-proxy proxy-target-class="false"/>
</bean>
 */
public class Notepad {
  // the details of this class are inconsequential to this example
}
