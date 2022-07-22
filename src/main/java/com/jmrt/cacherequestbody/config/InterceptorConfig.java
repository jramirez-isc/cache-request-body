package com.jmrt.cacherequestbody.config;

import com.jmrt.cacherequestbody.filter.RandomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jramirez created on 22/07/22
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  @Autowired
  RandomInterceptor randomInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(randomInterceptor);
  }
}