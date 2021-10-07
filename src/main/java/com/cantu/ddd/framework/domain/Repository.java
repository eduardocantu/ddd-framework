package com.cantu.ddd.framework.domain;

import java.util.List;

public interface Repository<K extends Entity> {

    K save(K entity);

    K findById(EntityId id);

    List<K> findAll();
}
