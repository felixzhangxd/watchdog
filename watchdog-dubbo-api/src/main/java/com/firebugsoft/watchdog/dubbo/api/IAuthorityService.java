package com.firebugsoft.watchdog.dubbo.api;

import java.util.List;

import com.firebugsoft.watchdog.dubbo.api.vto.Authority;

/**
 * 权限接口
 * @author felix
 */
public interface IAuthorityService {
    void save(Authority authority);
    void removeById(Long id);
    void modifyById(Authority authority);
    Authority findById(Long id);
    List<Authority> findBy(Long typeId, Long userId);
}
