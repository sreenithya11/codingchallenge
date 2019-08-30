package com.howtodoinjava.demo.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

import com.howtodoinjava.demo.model.CityNameVO;
import com.howtodoinjava.demo.model.CurrentWeather;
import com.howtodoinjava.demo.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module/addNew")
@SessionAttributes("employee")
public class EmployeeController
{
	final static Logger logger = Logger.getLogger(EmployeeController.class);
    @Autowired
    EmployeeManager manager;
     
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model)
    {
         CityNameVO employeeVO = new CityNameVO();
         model.addAttribute("employee", employeeVO);
         return "addEmployee";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") CityNameVO employeeVO,
                            BindingResult result, SessionStatus status, ModelMap model)
    {
        //Validation code start
    	logger.debug(employeeVO); //Verifying if information is same as input by user
        try{ 
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://samples.openweathermap.org/data/2.5/weather?q="+employeeVO.getCity();
        CurrentWeather currentWeather = restTemplate.getForObject(url, CurrentWeather.class);
        model.addAttribute("currentWeather",currentWeather);
        }catch(Exception e){
        	logger.error(e.getMessage());
        }
        //validation code ends
         
        //Store the employee information in database
        //manager.createNewRecord(employeeVO);
         
        //Mark Session Complete
        status.setComplete();
        return "redirect:addNew/success";
    }
     
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success(Model model)
    {
         return "addSuccess";
    }
}