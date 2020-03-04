package oose.dea.dao;

import oose.dea.domain.Jedi;

import javax.enterprise.inject.Alternative;

@Alternative
public class JediExcelDAO implements IJediDAO {

    @Override
    public Jedi getJedi(int customerId) {
        if (customerId <= 0)
            return null;

        // TODO: this should come from the Excel
        Jedi jedi = new Jedi();
        jedi.setCustomerId(customerId);
        jedi.setName("JediFromExcel");
        jedi.setRank(3);
        jedi.setDarkside(false);

        return jedi;
    }
}
