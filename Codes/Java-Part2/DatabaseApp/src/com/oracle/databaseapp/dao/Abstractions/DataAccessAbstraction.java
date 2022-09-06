package com.oracle.databaseapp.dao.Abstractions;

import java.util.Collection;

public interface DataAccessAbstraction<T> {
	Collection<T> fetchAllRecords() throws Exception;
	T fetchRecordById(int id) throws Exception;
	boolean addRecord(T obj)throws Exception;
	boolean updateRecord(T obj)throws Exception;
	boolean deleteRecord(int id)throws Exception;
	Collection<T> searchRecordsByName(String name)throws Exception;
}
