/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goldentoad.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Oscar Sanchez Boza
 
@Controller
public class RepController {
    @GetMapping("/reporte")
    public String login() {
        return "reporteN";
    }
}
