package com.oracle.databaseapp.bo.Abstractions;

import java.util.Collection;

public interface BusinessAbstractions<T> {
	Collection<T> getSortedRecords(int choice) throws Exception;
	T getRecordById(int id) throws Exception;
	boolean insertRecord(T obj) throws Exception;
	boolean modifyRecord(T obj) throws Exception;
	boolean removeRecord(int id) throws Exception;
	Collection<T> searchRecordsByName(String name) throws Exception;
}
