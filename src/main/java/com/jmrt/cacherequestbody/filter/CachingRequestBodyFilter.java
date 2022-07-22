package com.jmrt.cacherequestbody.filter;

import static java.nio.charset.Charset.defaultCharset;

import com.jmrt.cacherequestbody.filter.util.CachedBodyHttpServletRequest;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author jramirez created on 22/07/22
 */
@Component
@Slf4j
public class CachingRequestBodyFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {
    log.info("caching request");
    CachedBodyHttpServletRequest cachedBodyHttpServletRequest = new CachedBodyHttpServletRequest(
        request);

    String body = StreamUtils.copyToString(cachedBodyHttpServletRequest.getInputStream(),
        defaultCharset());
    log.info("Employee inside the filter " + body);

    filterChain.doFilter(cachedBodyHttpServletRequest, response);
  }
}