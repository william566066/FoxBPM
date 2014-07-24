/**
 * Copyright 1996-2014 FoxBPM Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author kenshin
 */
package org.foxbpm.engine.impl.datavariable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected String id;
	
	protected String name;
	
	protected String dataSource;
	
	protected List<DataVariableDefinition> dataVariableDefinitions=new ArrayList<DataVariableDefinition>();

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public List<DataVariableDefinition> getDataVariableDefinitions() {
		return dataVariableDefinitions;
	}

	public void setDataVariableDefinitions(List<DataVariableDefinition> dataVariableDefinitions) {
		this.dataVariableDefinitions = dataVariableDefinitions;
	}


}
