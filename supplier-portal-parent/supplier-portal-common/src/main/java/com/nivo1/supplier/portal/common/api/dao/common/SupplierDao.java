package com.nivo1.supplier.portal.common.api.dao.common;

import com.nivo1.supplier.portal.common.api.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
