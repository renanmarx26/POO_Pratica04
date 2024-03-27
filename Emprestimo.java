enum TipoEmprestimo {
    curto_prazo,
    longo_prazo
}

public class Emprestimo {

    private Material material;
    private TipoEmprestimo tipo;

    public Emprestimo(Material material, TipoEmprestimo tipo) {
        this.material = material;
        this.tipo = tipo;
    }

    public Material getMaterial() {
        return material;
    }

    public TipoEmprestimo getTipo() {
        return tipo;
    }
    public double Multa(int atraso) {
        double multa = 0;
        if (tipo == TipoEmprestimo.curto_prazo) {
            multa = atraso * 0.8;
        } else if (tipo == TipoEmprestimo.longo_prazo) {
            multa = atraso * 0.5;
        }
        return multa;
    }
}