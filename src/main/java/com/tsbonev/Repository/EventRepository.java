package com.tsbonev.Repository;

import com.tsbonev.Entity.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
