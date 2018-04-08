/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Lucas Borim
 */
public class ComandosGerais {
    
    private static Date datas = new Date();
    public static SimpleDateFormat formatoDataBanco = new SimpleDateFormat("yyyy/MM/dd");// datas.setText(formatoDataBanco.format(datas));
    public static SimpleDateFormat formatoDataPrograma = new SimpleDateFormat("dd/MM/yyyy");//
    private static String usuariologado; //pega o usuário logado
    
    //Retorna a data de hoje
    public static String getHistorico() {
        return usuariologado;
    }
    
    //Seta o usuario logado, valor vem do login
    public static void setHistorico(String historico) {
        ComandosGerais.usuariologado = historico;
    }
    
    public static SimpleDateFormat getSdf() {
        return formatoDataBanco;
    }
    
    
    public static Date getDatas() {
        return datas;
    }
    
    
    
    public static void main(String args[]){
        
        
        System.out.println(ComandosGerais.formatoDataBanco.format(ComandosGerais.getDatas()));
        
    }
    
}
