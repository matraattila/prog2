// Annotation is only applicable here
@Prog2Info(oktato = "Fónad Bálint", terem = "204")
public class Student {
    private String nev;
    private  String halozatiAzon;
    private String neptunKod;

    // Can't use annotation here
    public Student(String nev, String halozatiAzon, String neptunKod) {
        this.nev = nev;
        this.halozatiAzon = halozatiAzon;
        this.neptunKod = neptunKod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getHalozatiAzon() {
        return halozatiAzon;
    }

    public void setHalozatiAzon(String halozatiAzon) {
        this.halozatiAzon = halozatiAzon;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public void tanul() {
        System.out.println("A hallgató tanul");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("nev='").append(nev).append('\'');
        sb.append(", halozatiAzon='").append(halozatiAzon).append('\'');
        sb.append(", neptunKod='").append(neptunKod).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
