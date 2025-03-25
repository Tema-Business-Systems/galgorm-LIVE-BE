package com.transport.tracking.repository;

import com.transport.tracking.model.PickerList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PickersListRepository extends CrudRepository<PickerList, String> {

    public List<PickerList> findAll();

}
