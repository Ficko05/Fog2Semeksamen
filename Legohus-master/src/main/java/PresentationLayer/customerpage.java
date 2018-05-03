/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.OrderException;
import static java.lang.Compiler.command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicolai
 */
public class customerpage extends Command {

@Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderException {
        return "customerpage";
    }
}