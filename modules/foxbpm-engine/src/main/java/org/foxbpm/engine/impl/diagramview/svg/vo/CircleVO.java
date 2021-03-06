/**
 * Copyright 1996-2014 FoxBPM ORG.
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
 * @author MAENLIANG
 */
package org.foxbpm.engine.impl.diagramview.svg.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * 圆圈模型-映射到BPMN2.0中的事件对象
 * 
 * @author MAENLIANG
 * @date 2014-06-10
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CircleVO extends NamespaceAttributesVO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -981639681305762274L;
	@XmlAttribute(name = "cx")
	private Float cx;
	@XmlAttribute(name = "cy")
	private Float cy;
	@XmlAttribute(name = "r")
	private Float r;

	public Float getCx() {
		return cx;
	}

	public void setCx(Float cx) {
		this.cx = cx;
	}

	public Float getCy() {
		return cy;
	}

	public void setCy(Float cy) {
		this.cy = cy;
	}

	public Float getR() {
		return r;
	}

	public void setR(Float r) {
		this.r = r;
	}
}
