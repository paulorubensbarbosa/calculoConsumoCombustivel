package com.calculoconsumo.calculoConsumo.Controller;

import com.calculoconsumo.calculoConsumo.Repository.DistanceInfoDTO;
import com.calculoconsumo.calculoConsumo.Service.GoogleMapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class DistanceController {

    @Autowired
    GoogleMapsService googleMapsService;

    @GetMapping("/distance/{origem}/{destino}/{kmPorLitro}/{precoDoLitro}")
    public ResponseEntity<DistanceInfoDTO> getDistanceInfo(
            @PathVariable String origem,
            @PathVariable String destino,
            @PathVariable double kmPorLitro,
            @PathVariable double precoDoLitro
    ){

        double distancia = googleMapsService.getDistance(origem, destino);
        double consumoEmLitros = distancia / kmPorLitro;
        double valorViagem = consumoEmLitros * precoDoLitro;

        DistanceInfoDTO response = new DistanceInfoDTO(origem, destino, distancia, kmPorLitro, precoDoLitro, valorViagem);
        return ResponseEntity.ok().body(response);

    }
}
