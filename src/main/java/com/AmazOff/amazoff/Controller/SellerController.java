package com.AmazOff.amazoff.Controller;

import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.RequestDTO.SellerRequestDTO;
import com.AmazOff.amazoff.RequestDTO.UpdateSellerNameDTO;
import com.AmazOff.amazoff.ResponseDTO.SellerResponseDTO;
import com.AmazOff.amazoff.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/add_seller")
    public String addSeller(@RequestBody SellerRequestDTO sellerRequestDTO){

        return sellerService.addSeller(sellerRequestDTO);
    }

    @GetMapping("/get_sellerByPanCard")
    public SellerResponseDTO getSellerByPanCard(@RequestParam("panCard") String panCard){
        return sellerService.getSellerByPanCard(panCard);
    }

    @GetMapping("/get_sellerList")
    public List<SellerResponseDTO> getAllSeller(){
        return sellerService.getAllSeller();
    }

    @PutMapping("/update_SellerName")
    public String updateSellerName(@RequestBody UpdateSellerNameDTO updateSellerNameDTO){
        return sellerService.updateSellerName(updateSellerNameDTO);
    }
}
