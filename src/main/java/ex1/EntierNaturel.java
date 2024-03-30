package ex1;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative", val);
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative", val);
        }
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if (val == 0) {
            throw new NombreNegatifException("La valeur est déjà nulle", 0);
        }
        val--;
    }
}
