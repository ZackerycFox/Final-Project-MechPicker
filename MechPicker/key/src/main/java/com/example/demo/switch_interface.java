package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface switch_interface extends CrudRepository <switches, Integer> {
	
	List<switches> findByid(int id);
	List<switches> findByBrand(String brand); 
	List<switches> findByType(String type);
	List<switches> findByTactile(boolean tactile); 
	List<switches> findByClicky(boolean clicky);
	List<switches> findByLinear(boolean linear);
	List<switches> findBySilent(boolean silent); 
	
	@Query(value = "select * from models where switch_pic = :Picid", nativeQuery = true)
	List<switches> findByswitch_pic(String Picid);
	
	
	@Modifying
	@Transactional
	@Query(value = "insert into switches (brand, type, tactile, clicky, linear, silent, switch_pic, switch_sound) "
			+ " values(:newbrand, :newtype, "
			+ " :newtactile, :newclicky, :newlinear, :newsilent, :newswitch_pic, :newswitch_sound)", nativeQuery = true)
	void postNewswitch(String newbrand, String newtype,
			boolean newtactile, boolean newclicky, boolean newlinear, boolean newsilent, String newswitch_pic, String newswitch_sound);
	

}
