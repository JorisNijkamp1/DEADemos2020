package oose.dea.dao;

import oose.dea.domain.Lightsaber;

import javax.enterprise.inject.Default;

@Default
public class LightsaberDAO implements ILightsaberDAO {

    @Override
    public Lightsaber getLightsaber() {
        // TODO: This should come from the Database
        Lightsaber lightsaber = new Lightsaber();
        lightsaber.setColor("red");
        lightsaber.setSides(8);

        return lightsaber;
    }
}
