package com.nivo1.supplier.portal.common.api.dao.common;

import com.nivo1.supplier.portal.common.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
