package Cap12JacaCollectionsFramework;

import java.util.Comparator;

public class TitularComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta o1, Conta o2) {
        return o1.getNomeCliente().compareTo(o2.getNomeCliente());
    }
    
}
