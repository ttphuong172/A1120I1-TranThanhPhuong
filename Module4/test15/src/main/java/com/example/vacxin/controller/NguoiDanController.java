package com.example.vacxin.controller;

import com.example.vacxin.model.NguoiDan;
import com.example.vacxin.service.DuongService;
import com.example.vacxin.service.NguoiDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class NguoiDanController {
    @Autowired
    private NguoiDanService nguoiDanService;
    @Autowired
    private DuongService duongService;

    @GetMapping("")
    public String loadNguoiDan(Model model) {
        model.addAttribute("nguoiDan", new NguoiDan());
        model.addAttribute("duongList", duongService.selectAllDuong());
        model.addAttribute("nguoiDanList", nguoiDanService.findAllByOrderByIdNguoiDanDesc());
        return "list";
    }

    @PostMapping("save")
    public String saveNguoiDan(@Valid NguoiDan nguoiDan, BindingResult bindingResult, Model model, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        new NguoiDan().validate(nguoiDan, bindingResult);
        model.addAttribute("url",request.getHeader("referer"));
        if (bindingResult.hasErrors()) {

            model.addAttribute("duongList", duongService.selectAllDuong());
            model.addAttribute("nguoiDanList", nguoiDanService.findAllByOrderByIdNguoiDanDesc());
            return "list";
        }
        try{
            nguoiDanService.saveNguoiDan(nguoiDan);
        } catch (DataIntegrityViolationException e){
            redirectAttributes.addFlashAttribute("msg","Trùng số CMND");
        }

        return "redirect:/";
    }
    @GetMapping("edit/{idNguoiDan}")
    public String createNguoiDan(@PathVariable int idNguoiDan,Model model,HttpServletRequest request){
        model.addAttribute("url",request.getHeader("referer"));
        model.addAttribute("duongList", duongService.selectAllDuong());
        model.addAttribute("nguoiDan",nguoiDanService.findNguoiDanById(idNguoiDan));
        return "edit";
    }
}