package com.memorynotfound.controller;
import com.memorynotfound.Student;
import com.memorynotfound.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.memorynotfound.StudentJDBCTemplate;

//import javax.validation.Valid;

@Controller
//@SessionAttributes("id")
public class StudentController {

//    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);


//    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

//    @RequestMapping(value = {"/" ,"/loginPage"}, method = RequestMethod.GET)
//    public String index(ModelMap model){
//        System.out.println("proverka prisutstviia");
//        model.addAttribute("message", "HyMcu");
//        return "loginPage";}

    @RequestMapping(value = { "/" ,"/loginPage"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        System.out.println("proverka prisutstviia");
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName("loginPage");
        return model;
    }


    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String home(ModelMap model){
        System.out.println("proverka prisutstviia v RESULTE");
        model.addAttribute("message", "HyMcu");
        return "result";}

    @RequestMapping(value = "/fail", method = RequestMethod.GET)
    public String fail(ModelMap model){
        System.out.println("proverka prisutstviia v fail");
        model.addAttribute("message", "HyMcu");
        return "fail";}

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView main() {
//        System.out.println("sasay");
//        return new ModelAndView("login", "user", new User());
//    }
//
//    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
//    public ModelAndView checkUser(@ModelAttribute("user") User user) {
//        if(studentJDBCTemplate.userCheck(user.getLogin(), user.getPassword())){
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.addObject("id", studentJDBCTemplate.findId(user.getLogin()));
//            modelAndView.setViewName("result");
//            return modelAndView;
////            return new ModelAndView("result", "user", user);
//        } else {
//            return new ModelAndView("fail", "user", null);}
//    }
//
//    //    редактирование профиля студета
//    @RequestMapping(value = "/editProfile", method = RequestMethod.GET)
//    public ModelAndView editProfile(@ModelAttribute("id") int id) {
//        return new ModelAndView("editStudent", "student", studentJDBCTemplate.getStudent(id));
//    }
//    @RequestMapping(value="/editStudent", method = RequestMethod.POST)
//    public ModelAndView editStudent (@ModelAttribute("student") Student editStudent, @ModelAttribute("id") int id){
////        System.out.println(editStudent);
//        studentJDBCTemplate.update(editStudent, id);
//        return new ModelAndView("editRegistration","student", editStudent );
//
//    }
//
//    //    регистрация учетной записи студента в БД
//    @RequestMapping(value = "/student", method = RequestMethod.GET)
//    public ModelAndView student() {
//        return new ModelAndView("student", "student", new Student());
//    }
//
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public ModelAndView registration(@ModelAttribute("student") Student student) {
//
//        studentJDBCTemplate.create(student.getLogin(), student.getPassword(), student.getAge(), student.getGender(), student.getSchool());
//
//        return new ModelAndView("registration", "user", student);
//    }
//
//
//    // выход из учетной записи
//    @RequestMapping(value = "/logout", method = RequestMethod.GET)
//    public ModelAndView logOut(){
//        return new ModelAndView("logout", "id", 0);
//    }
}