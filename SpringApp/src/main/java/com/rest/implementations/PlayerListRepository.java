package com.rest.implementations;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerListRepository extends CrudRepository<PlayerList, String[]> {

}
