package com.transport.tracking.repository;

import com.transport.tracking.model.TempRoute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TempRouteRepository extends CrudRepository<TempRoute, String> {

    public List<TempRoute> findAll();

    public List<TempRoute> findByFcy(String fcy);

    public List<TempRoute> findByFcyAndDatliv(String fcy, Date date);

    public List<TempRoute> findByDatliv(Date date);

    public TempRoute findByXnumpc(String vrcode);
}
