package com.nivo1.supplier.portal.common.api.dao.tenant;

import com.nivo1.supplier.portal.common.api.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyDao extends JpaRepository<Currency, Integer> {
}
