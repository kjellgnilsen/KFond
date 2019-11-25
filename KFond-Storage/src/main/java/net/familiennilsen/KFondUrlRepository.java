package net.familiennilsen;

import org.springframework.data.repository.CrudRepository;

import net.familiennilsen.model.KFondUrlHash;

public interface KFondUrlRepository extends CrudRepository<KFondUrlHash, String>{

}
