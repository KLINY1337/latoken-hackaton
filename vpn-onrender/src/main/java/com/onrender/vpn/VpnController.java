package com.onrender.vpn;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vpn/reroute")
public class VpnController {

    private final VpnService vpnService;

    @GetMapping("/")
    public ResponseEntity getResponseFromUrl(gptDto gptDto) {
        return ResponseEntity.ok(vpnService.getResponseFromUrl(gptDto));
    }
}
