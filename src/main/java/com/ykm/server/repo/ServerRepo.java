package com.ykm.server.repo;

import com.ykm.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yankunM
 * @version 1.0
 * @since 1/29/2023
 */
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
//    Server findByName(String name);
}
