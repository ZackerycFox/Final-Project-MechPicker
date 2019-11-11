package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface sku_interface extends CrudRepository <sku, Integer> {
	
	
	List<sku> findByid(int mid);
	
	@Query(value = "select * from sku where model_id = :modid", nativeQuery = true)
	List<sku> findBymodel_id(int modid);
	
	@Query(value = "select * from sku where switch_id = :switchid", nativeQuery = true)
	List<sku> findByswitch_id(int switchid);
	
	//Deleting an sku
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM sku WHERE (id)", nativeQuery = true)
	void deleteSkuid(int id);
	
	//Narrowing down by Switch Sound*******************************************************************************************************

	@Query(value = "select * from sku where switch_id in\r\n (select id from switches where clicky = 1 )", nativeQuery = true)
	List<sku> findByclick();
	
	@Query(value = "select * from sku where switch_id in\r\n (select id from switches where silent = 1 )", nativeQuery = true)
	List<sku> findBysilent();
	
	//Narrowing down by fullsize****************************************************************************************************************************************

	@Query(value = "select * from sku where model_id in\r\n (select id from models where fullsized = 1 )", nativeQuery = true)
	List<sku> findByfullsized(); 
	
	@Query(value = "select * from sku where model_id in (select id from models where fullsized = 1 ) and switch_id in (select id from switches where clicky = 1)",
	nativeQuery = true)
	List<sku> findByfullClick();
	
	@Query(value = "select * from sku where model_id in (select id from models where fullsized = 1 ) and switch_id in  (select id from switches where silent = 1)",
	nativeQuery = true)
	List<sku> findByfullSilent();
	
	

	//Narrowing down by tkl*********************************************************************************************************************************************
	
	@Query(value = "select * from sku\r\n where model_id in\r\n (select id from models where tkl = 1 )", nativeQuery = true)
	List<sku> findBytkl(); 
	
	@Query(value = "select * from sku where model_id in (select id from models where tkl = 1 ) and switch_id in (select id from switches where clicky = 1)",
	nativeQuery = true)
	List<sku> findBytklClick();
	
	@Query(value = "select * from sku where model_id in (select id from models where tkl = 1 ) and switch_id in (select id from switches where silent = 1)",
	nativeQuery = true)
	List<sku> findBytklSilent();
	
	
	
	//Narrowing down by sixty*******************************************************************************************************************************************
	
	@Query(value = "select * from sku\r\n where model_id in\r\n" + "(select id from models where sixty = 1 )", nativeQuery = true)
	List<sku> findBysix(); 
	
	@Query(value = "select * from sku where model_id in (select id from models where sixty = 1 ) and switch_id in (select id from switches where clicky = 1)",
	nativeQuery = true)
	List<sku> findBysixClick();
	
	@Query(value = "select * from sku where model_id in (select id from models where sixty = 1 ) and switch_id in (select id from switches where silent = 1)",
	nativeQuery = true)
	List<sku> findBysixSilent();

	
}