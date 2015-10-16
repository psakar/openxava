package org.openxava.session;

import java.io.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.actions.*;
import org.openxava.annotations.*;
import org.openxava.model.meta.*;

/**
 * 
 * @author Federico Alcantara
 * @author Javier Paniza
 */

@View(members = 
	"chartType[chartType; columns], chartData;" + 
	"xColumn;"  
)	
public class Chart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Hidden
	private MetaModel metaModel;
	
	@LabelFormat(LabelFormatType.NO_LABEL)
	private String chartData;

	public enum ChartType {
		BAR("bar", false),		
		LINE("line", false),
		PIE("pie", false);
		String jsType;
		boolean grouped;
		private ChartType(String jsType, boolean grouped) {
			this.jsType = jsType;
			this.grouped = grouped;
		}
		public String jsType() {
			return jsType;
		}
		public boolean grouped() {
			return grouped;
		}
	};
	@LabelFormat(LabelFormatType.NO_LABEL) 
	private ChartType chartType;
	
	@LabelFormat(LabelFormatType.NO_LABEL) 
	@OnChange(value = OnChangeChartXColumnAction.class)
	private String xColumn;  
	
	@RemoveSelectedAction("Chart.removeColumn")
	@ListProperties("name")
	@ElementCollection
	private List<ChartColumn> columns;
	
	private boolean rendered;  
	
	public Chart() {
	}
	
	public MetaModel getMetaModel() {
		return metaModel;
	}

	public void setMetaModel(MetaModel metaModel) {
		this.metaModel = metaModel;
	}

	public String getChartData() {
		return chartData;
	}

	public void setChartData(String data) {
		this.chartData = data;
	}

	public ChartType getChartType() {
		return chartType;
	}

	public void setChartType(ChartType chartType) {
		this.chartType = chartType;
	}

	public String getxColumn() {
		return xColumn;
	}

	public void setxColumn(String xAxis) {
		this.xColumn = xAxis;
	}

	public List<ChartColumn> getColumns() {
		return columns;
	}

	public void setColumns(List<ChartColumn> columns) {
		this.columns = columns;
	}

	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(boolean rendered) {
		this.rendered = rendered;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chart [chartType=");
		builder.append(chartType);
		builder.append("]");
		return builder.toString();
	}
	
}
