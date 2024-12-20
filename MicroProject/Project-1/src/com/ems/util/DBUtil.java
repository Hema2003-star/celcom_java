package com.ems.util;

import java.util.HashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;

/**
 * @version 1.0 
 * It is used to store the data (Map as DB and List as DB )
 */
public class DBUtil {

	private static List<Employee> list = new LinkedList<>(); // only one list object
	private static Map<Integer, Employee> map = new HashMap<>(); // map collection

	/**
	 * 
	 * @return List<Employee> 
	 * Creating Instance for listDB
	 * 
	 */
	public static List<Employee> getListDBInstance() { // database utility class

		return list;

	}

	/**
	 * 
	 * @return Map<Integer, Employee> 
	 * Creating Instance for mapDB
	 */

	public static Map<Integer, Employee> getMapDBInstance() { // database utility class

		return map;

	}

}
