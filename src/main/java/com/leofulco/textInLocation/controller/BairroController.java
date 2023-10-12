package com.leofulco.textInLocation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BairroController {

    @GetMapping("/location")
    public String getLocation(@RequestParam String address) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String bingMapsUrl = "http://dev.virtualearth.net/REST/v1/Locations?locality=" + address + "&key=AhUifdbZspbkXPBMsf7Rw-aw0ciChRGHsgfEilc2a95JZRNVO3go4vfUJ3nWzqJe";
        String response = restTemplate.getForObject(bingMapsUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        root = mapper.readTree(response);
        JsonNode result = root.path("resourceSets").get(0).path("resources").get(0);
        String bairro = result.path("name").asText();
        String cidade = result.path("address").path("locality").asText();
        String regiao = result.path("address").path("adminDistrict").asText();
        double latitude = result.path("point").path("coordinates").get(0).asDouble();
        double longitude = result.path("point").path("coordinates").get(1).asDouble();

        return "Bairro: " + bairro + ", Cidade: " + cidade + ", Região: " + regiao + ", Latitude: " + latitude + ", Longitude: " + longitude;
    }


}
