package com.jmrt.cacherequestbody.filter;

import static java.nio.charset.Charset.defaultCharset;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author jramirez created on 22/07/22
 */
@Slf4j
@Component
public class RandomInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
      throws IOException {
    String body = StreamUtils.copyToString(request.getInputStream(), defaultCharset());
    log.info("Intercepted Employee" + body);
    return true;
  }
}