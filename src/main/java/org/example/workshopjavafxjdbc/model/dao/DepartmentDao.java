package org.example.workshopjavafxjdbc.model.dao;

import java.util.List;

import org.example.workshopjavafxjdbc.model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<org.example.workshopjavafxjdbc.model.entities.Department> findAll();
}
