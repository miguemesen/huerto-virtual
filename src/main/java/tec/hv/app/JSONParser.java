package tec.hv.app;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;


import java.util.ArrayList;

public class JSONParser {
  private File file;
  private ObjectMapper mapper;
  private JsonNode nodo;

  public JSONParser() {
    file = new File("resources/data.json");
    mapper = new ObjectMapper();

    try {
      nodo = mapper.readTree(file);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public ArrayList < PlantCreator > cargarPlantas() {

    ArrayList < PlantCreator > listPlantas = new ArrayList < > ();
    ArrayNode plantas = (ArrayNode) nodo.get("plantas");

    if (plantas != null) {
      for (int i = 0; i < plantas.size(); i++) {
        JsonNode planta = plantas.get(i);
        String tipo = planta.get("tipo").asText();
        String nombre = planta.get("nombre").asText();
        int riego = 45 / ((planta.get("riego").asInt()) + 1);
        int abono = planta.get("abono").asInt();
        int cosecha = planta.get("abono").asInt();
        
        PlantCreator nuevaPlanta = new PlantCreator(tipo, nombre, riego, abono, cosecha);
        listPlantas.add(nuevaPlanta);
        
        }

      }
    
    return listPlantas;
  }
  
  public Player cargarJugador() {
	  ArrayNode jugador = (ArrayNode) nodo.get("jugador");
	  JsonNode persona = jugador.get(0);
	  
	  
	  int id = persona.get("id").asInt();
      String nombre = persona.get("nombre").asText();
      String rango =persona.get("rango").asText();
      int puntaje = persona.get("puntaje").asInt();
	  
      Player player = new Player(id, nombre, rango, puntaje);
	  return player;
	  
	  
  }

}