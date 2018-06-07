import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    //He efectuado un rename
    private Collection asignaturas;
    public static float cost = 0;

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.curs = curs;
        this.asignaturas = assignatures;
    }
    public float costMatricula(){
        float coste = cost;
        int credits = 0;

        for (Iterator iter = asignaturas.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * 15;
        return cost;
    }
}