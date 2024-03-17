package org.application.hw8_spring.cacheProxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

@Component
public class CacheProxy {

    public static <T> T cache(T object, String cacheFolder, Class<T> clazz) {
        var invocationHandler = new CacheHandler(object, cacheFolder);

        return clazz.cast(Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                new Class[]{clazz},
                invocationHandler));
    }
}
