package org.familysearch.tutorials.java16;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.ClassLoader.getSystemClassLoader;
import static org.assertj.core.api.Assertions.assertThat;

class InvokeDefaultTest {
  @Test
  void invokeDefault() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Object proxyObject = Proxy.newProxyInstance(getSystemClassLoader(), new Class<?>[] { InvokeDefault.HelloWorld.class },
        (proxy, method, args) -> {
          if (method.isDefault()) {
            return InvocationHandler.invokeDefault(proxy, method, args);
          } else {
            return method.invoke(proxy, args);
          }
        }
    );

    Method method = proxyObject.getClass().getMethod("hello");
    assertThat(method.invoke(proxyObject)).isEqualTo("world");
  }

}