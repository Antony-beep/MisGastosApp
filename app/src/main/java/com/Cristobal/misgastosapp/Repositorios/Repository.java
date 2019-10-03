package com.Cristobal.misgastosapp.Repositorios;

import com.Cristobal.misgastosapp.modelo.Contabilidad;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static List<Contabilidad> contabilidadList;
    static{
        contabilidadList = new ArrayList<>();
        contabilidadList.add(new Contabilidad(100,"Ingreso","Tarjeta de credito"));
        contabilidadList.add(new Contabilidad(200,"Egreso","Tarjeta de credito"));
        contabilidadList.add(new Contabilidad(140,"Ingreso","Ahorro"));
        contabilidadList.add(new Contabilidad(550,"Egreso","Efectivo"));
    }
    public static List<Contabilidad> getContabilidadList() {
        return contabilidadList;
    }
}
