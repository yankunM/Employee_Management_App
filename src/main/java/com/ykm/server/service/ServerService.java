package com.ykm.server.service;

import com.ykm.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

/**
 * @author yankunM
 * @version 1.0
 * @since 1/29/2023
 */
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
