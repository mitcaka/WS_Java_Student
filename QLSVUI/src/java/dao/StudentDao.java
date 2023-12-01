/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import webservice.Student;

/**
 *
 * @author ADMIN
 */
public class StudentDao {

    public static void addStudent(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        webservice.StudentWS_Service service = new webservice.StudentWS_Service();
        webservice.StudentWS port = service.getStudentWSPort();
        port.addStudent(arg0, arg1, arg2, arg3);
    }

    public static void deleteStudent(java.lang.String arg0) {
        webservice.StudentWS_Service service = new webservice.StudentWS_Service();
        webservice.StudentWS port = service.getStudentWSPort();
        port.deleteStudent(arg0);
    }

    public static java.util.List<webservice.Student> findAll() {
        webservice.StudentWS_Service service = new webservice.StudentWS_Service();
        webservice.StudentWS port = service.getStudentWSPort();
        return port.findAll();
    }

    public static void updateStudent(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        webservice.StudentWS_Service service = new webservice.StudentWS_Service();
        webservice.StudentWS port = service.getStudentWSPort();
        port.updateStudent(arg0, arg1, arg2, arg3);
    }

    public static Student findStudent(java.lang.String arg0) {
        webservice.StudentWS_Service service = new webservice.StudentWS_Service();
        webservice.StudentWS port = service.getStudentWSPort();
        return port.findStudent(arg0);
    }
    
    
    
    
}
