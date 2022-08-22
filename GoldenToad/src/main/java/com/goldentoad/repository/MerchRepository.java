/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.repository;

import com.goldentoad.entity.Merch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author madri
 */

@Repository
public interface MerchRepository extends CrudRepository<Merch,Long>{
    Merch findByTitle(String title);
    
}
