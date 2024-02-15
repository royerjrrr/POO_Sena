public class bodega {
private Integer codigo;
private Integer precio;
private Integer cantBodega;
private Integer minBodega;


    public Integer getMinBodega() {
        return minBodega;
    }

    public Integer getCantBodega() {
        return cantBodega;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public bodega(Integer codigo, Integer precio, Integer cantBodega, Integer minBodega) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantBodega = cantBodega;
        this.minBodega = minBodega;
    }
}


