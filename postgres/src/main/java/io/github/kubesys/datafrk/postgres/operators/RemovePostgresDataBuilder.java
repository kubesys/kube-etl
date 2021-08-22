/*

 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.datafrk.postgres.operators;

import io.github.kubesys.datafrk.core.operators.RemoveData;
import io.github.kubesys.datafrk.core.operators.RemoveDataBuilder;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2.0.0
 *
 */
public class RemovePostgresDataBuilder extends RemoveDataBuilder<RemovePostgresDataBuilder, RemoveData> {

	@Override
	public RemovePostgresDataBuilder eq(String value, boolean json) {
		if (!json) {
			return eq(value);
		}
		stringBuilder.append(" = '" + value + "'::json");
		return this;
	}
		
}
