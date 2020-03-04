package oose.dea;

import oose.dea.api.StarWars;
import oose.dea.api.dto.JediDTO;
import oose.dea.api.dto.LightSaberDTO;
import oose.dea.dao.IJediDAO;
import oose.dea.dao.ILightsaberDAO;
import oose.dea.domain.Jedi;
import oose.dea.domain.Lightsaber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StarWarsTest {

    private static StarWars starWars;

    @BeforeAll
    public static void setup() {
        starWars = new StarWars();
    }

    @Test
    public void helloTest() {
        String expected = "May the force be with you, always";
        assertEquals(expected, starWars.hello());
    }

    @Test
    public void getJediTest() {
        // Setup Mock
        IJediDAO jediDAO = mock(IJediDAO.class);
        Jedi jedi = new Jedi();
        jedi.setName("testJedi");
        jedi.setCustomerId(1);
        jedi.setRank(1);
        jedi.setDarkside(true);
        when(jediDAO.getJedi(1)).thenReturn(jedi);
        starWars.setJediDAO(jediDAO);
        // actual test
        Response response = starWars.getJedi(1);
        JediDTO jediDTO = (JediDTO) response.getEntity();
        assertEquals(200, response.getStatus());
        assertEquals("testJedi", jediDTO.name);
        assertEquals(1, jediDTO.customerId);
    }

    @Test
    public void getLightsaberTest(){
        ILightsaberDAO lightsaberDAO = mock(ILightsaberDAO.class);
        Lightsaber lightsaber = new Lightsaber();

        lightsaber.setColor("red");
        lightsaber.setSides(8);
        when(lightsaberDAO.getLightsaber()).thenReturn(lightsaber);
        starWars.setILightsaberDAO(lightsaberDAO);
        // Actual test
        Response response = starWars.getLightSaber();
        LightSaberDTO lightSaberDTO = (LightSaberDTO) response.getEntity();
        assertEquals(200, response.getStatus());
        assertEquals("red", lightSaberDTO.color);
        assertEquals(8, lightSaberDTO.sides);
    }

    @Test
    public void getJediTestNotFound() {
        // Mock test
        IJediDAO jediDAO = mock(IJediDAO.class);
        Jedi jedi = new Jedi();
        jedi.setCustomerId(1);

        when(jediDAO.getJedi(13)).thenReturn(null);

        starWars.setJediDAO(jediDAO);

        // Actual test
        Response response = starWars.getJedi(13);

        assertEquals(404, response.getStatus());
    }
}
