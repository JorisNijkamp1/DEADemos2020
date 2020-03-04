package oose.dea.dao;

import oose.dea.domain.Jedi;

public interface IJediDAO {
    /**
     * Returns specified Jedi basad on customerId
     * @param customerId
     * @return Jedi in database
     */
    Jedi getJedi(int customerId);
}
