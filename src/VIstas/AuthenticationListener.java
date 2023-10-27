/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VIstas;

/**
 *
 * @author joelb
 */
public interface AuthenticationListener {
    /*esta interfaz notifica a MenuPrincipal que la autenticacion de VentanaLogin
    fue exitosa*/
    void onAuthenticationSuccess();
    void onReservarSuccess();
}
