package com.oracle.databaseapp.bo.Abstractions;

import java.util.Collection;

public interface BusinessAbstractions<T> {
	Collection<T> getSortedRecords(int choice) throws Exception;
	T getRecordById(int id) throws Exception;
	boolean insertRecord(T obj);
	boolean modifyRecord(T obj);
	boolean removeRecord(int id);
	Collection<T> searchRecordsByName(String name);
}
