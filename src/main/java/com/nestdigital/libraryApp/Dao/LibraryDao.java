package com.nestdigital.libraryApp.Dao;

import com.nestdigital.libraryApp.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}
