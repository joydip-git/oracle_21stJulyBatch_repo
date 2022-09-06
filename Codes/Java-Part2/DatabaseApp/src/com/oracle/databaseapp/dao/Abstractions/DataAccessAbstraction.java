package com.oracle.databaseapp.dao.Abstractions;

import java.sql.SQLException;
import java.util.Collection;

public interface DataAccessAbstraction<T> {
	Collection<T> fetchAllRecords() throws SQLException;
	T fetchRecordById(int id) throws SQLException;
	boolean addRecord(T obj);
	boolean updateRecord(T obj);
	boolean deleteRecord(int id);
	Collection<T> searchRecordsByName(String name);
}
