package net.familiennilsen;

import org.springframework.data.repository.CrudRepository;

import net.familiennilsen.model.KFondBasic;

public interface KFondAuthorTitleRepository extends CrudRepository<KFondBasic, String> {
	

}
