package com.nivo1.supplier.portal.common.web.security;

import org.springframework.util.Assert;

public class ClientContextHolder {

    private static final ThreadLocal<String> clientContextHolder = new ThreadLocal<>();

    public static String getClientIdentifier() {
        return clientContextHolder.get();
    }

    public static void setClientIdentifier(String clientIdentifier) {
        Assert.notNull(clientIdentifier, "ClientIdentifier cannot be null");
        clientContextHolder.set(clientIdentifier);
    }

    public static void clear() {
        clientContextHolder.remove();
    }
}
