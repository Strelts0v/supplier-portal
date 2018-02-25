package com.nivo1.supplier.portal.common.api.config;

import com.nivo1.supplier.portal.common.web.security.ClientContextHolder;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class ClientIdentifierResolver implements CurrentTenantIdentifierResolver {

    @Override
    public String resolveCurrentTenantIdentifier() {
        String id = ClientContextHolder.getClientIdentifier();
        return id == null ? "supplierportal" : id;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
