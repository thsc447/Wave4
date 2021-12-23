package ModuloPOO.POO_II.classII.Ex02.entities;

import java.util.List;

public class Area {

    public static double Media (List<FiguraGeometrica> arr){
        double areaTotal = 0;
        for (FiguraGeometrica a : arr) {
            areaTotal += a.area();
        }
        return areaTotal / arr.size();
    }
}
