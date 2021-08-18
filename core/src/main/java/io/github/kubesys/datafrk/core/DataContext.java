/*

 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.datafrk.core;

import io.github.kubesys.datafrk.core.crud.CheckDatabase;
import io.github.kubesys.datafrk.core.crud.CreateDatabase;
import io.github.kubesys.datafrk.core.crud.DropDatabase;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2.0.0
 *
 */
public interface DataContext {
	
	public Database currentDatabase();

	public boolean createDatabase(CreateDatabase createDatabase);
	
	public boolean checkDababase(CheckDatabase dropDatabase);
	
	public boolean dropDababase(DropDatabase dropDatabase);
	
}
