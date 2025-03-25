package com.transport.tracking.repository;

import com.transport.tracking.model.OpenToAddDocs;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


public interface OpenToAddDocsRepository extends CrudRepository<OpenToAddDocs, String> {

    public List<OpenToAddDocs> findBySite(String site);

    public List<OpenToAddDocs> findBySiteAndDocdate(String site, Date date);




}
