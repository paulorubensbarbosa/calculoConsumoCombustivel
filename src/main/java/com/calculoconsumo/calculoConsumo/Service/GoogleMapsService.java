package com.calculoconsumo.calculoConsumo.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoogleMapsService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${google.maps.api.key}")
    private String API_KEY;

    //private static final String API_KEY = apiKey;


        public double getDistance(String origem, String destino){
        String url = String.format("https://maps.googleapis.com/maps/api/distancematrix/json?origins=%s&destinations=%s&key=%s", origem, destino, API_KEY);

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

            Map<String, Object> body = response.getBody();
            if (body == null || !"OK".equals(body.get("status"))) {
                throw new RuntimeException("Resposta inválida da API do Google Maps");
            }

            List<Map<String, Object>> rows = (List<Map<String, Object>>) body.get("rows");
            if (rows.isEmpty()) {
                throw new RuntimeException("Nenhuma linha encontrada na resposta");
            }

            List<Map<String, Object>> elements = (List<Map<String, Object>>) rows.get(0).get("elements");
            if (elements.isEmpty()) {
                throw new RuntimeException("Nenhum elemento encontrado na resposta");
            }

            Map<String, Object> distance = (Map<String, Object>) elements.get(0).get("distance");
            if (distance == null) {
                throw new RuntimeException("Distância não encontrada");
            }

            return parseDistance(distance.get("value"));
        }

        private double parseDistance(Object value){
            if (value instanceof Number) {
                return ((Number) value). doubleValue() / 1000.0;
            } else {
                throw new RuntimeException("Formato de distância inválido");
            }
    }
}
