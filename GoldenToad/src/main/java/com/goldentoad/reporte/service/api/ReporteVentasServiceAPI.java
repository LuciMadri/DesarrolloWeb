package com.goldentoad.reporte.service.api;
//

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.goldentoad.reporte.model.ReporteVentasDTO;

import net.sf.jasperreports.engine.JRException;

public interface ReporteVentasServiceAPI {
	
	ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params) throws JRException, IOException, SQLException;

}
