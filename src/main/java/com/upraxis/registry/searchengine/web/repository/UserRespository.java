/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upraxis.registry.searchengine.web.repository;

import com.upraxis.registry.searchengine.web.domain.Users;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 *
 * @author jesse
 */
public interface  UserRespository extends SolrCrudRepository<Users, String>{
    
}
