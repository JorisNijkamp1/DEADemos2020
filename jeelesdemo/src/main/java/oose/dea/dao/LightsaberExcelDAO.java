package oose.dea.dao;

import oose.dea.domain.Lightsaber;

import javax.enterprise.inject.Alternative;

@Alternative
public class LightsaberExcelDAO implements ILightsaberDAO {

    @Override
    public Lightsaber getLightsaber() {
        // TODO: This should come from a Excel sheet
        Lightsaber lightsaber = new Lightsaber();
        lightsaber.setColor("Purple");
        lightsaber.setSides(20);

        return lightsaber;
    }
}
